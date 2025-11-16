/* 
<!-- 
 * $Source: /web/cvs/olc/webapp/styles/shared/v2_dhtml.js,v $
 * $Revision: 1.5 $
 * $Author: mathews $
 * $Date: 2010/04/09 11:31:20 $
 * 
 * Copyright 2002 The McGraw-Hill Companies.  All Rights Reserved
 *
 * REVISION HISTORY 
 * ================
 * NOTE: CVS automatically inserts check-in comments below.  Add manually only if reqd.
 *
 * $Log: v2_dhtml.js,v $
 * Revision 1.5  2010/04/09 11:31:20  mathews
 * changed the unique SiteID to 2214 from 1987 for BlueKai
 *
 * Revision 1.4  2010/03/22 15:01:53  mathews
 * Changes made for BlueKai JavaScript
 *
 * Revision 1.3  2008/12/22 17:30:46  pkumar
 * Olc ads Rolled back
 *
 * Revision 1.2  2008/12/22 13:01:20  pkumar
 * OLc Ads
 *
 * Revision 1.1  2003/04/13 02:36:53  daniel
 * First version with new CVS structure; not yet fully tested
 *
 *
--> 
*/

/* 
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
::
::  This file contains functions specific to the v2 style.
::  Many related functions are in v2_functions.js
::
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/

/* 
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   Default values
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/

var toolOrigin = 80;
var toolTop = 80;
var navOffset = 20;
var scrolledBy = 0;
var winWidth = 0;
var curTool="";
var floaters = new Array();
var offsetFloaters = new Array();
var toolLayers = new Array();
var curScript = "";
var nextScript = "";
var intervalID = 0;
var navIsOpen = 1;
// var isLocked = 0;		// not needed (eRights takes care of it)
var isDynamic = 0;			// so Notes can tell when it's working with dynamic content
var needPrefsUpdate = 0;	// triggers refresh of cookie data after prefs change (not needed; always a server roundtrip now)

// These are defaults; may be overridden by cookies:
var floatNav = 1;
var loggedIn = 0;
var teachersEdition=0;
var curNav="nav";
var glideSpeed="3";
var oldSitemapPage="";

/* 
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   Init and Page monitor
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/
function loadBlueKaiJS()
{
	var headID = document.getElementsByTagName("head")[0];
	
//	create a new script tag
	var newScript = document.createElement('script');
	newScript.type = 'text/javascript';
	newScript.src = 'http://www.bkrtx.com/js/bk-static.js';

//	the java script API needs to be executed only onLoad of this js file.	
	newScript.onload=loadIframeAndExecuteBlueKaiAPI;

//	finally add this element to the head.
	headID.appendChild(newScript);
	
		
}

function loadIframeAndExecuteBlueKaiAPI(){
	var obj = document.getElementById('studentEdition');
	obj.innerHTML=obj.innerHTML+"<iframe name='__bkframe' height='0' width='0' frameborder='0' src='javascript:void(0)'></iframe>"
	
	var isbn= window.document.forms.feedbackForm.siteISBN.value.toLowerCase();

	bk_addPageCtx('isbn',isbn);

	bk_doJSTag(2214,4); //this sends 2214, the McGraw-Hill unique identifer, to BlueKai

}

function PageLoad() {
	// use this for functions that should be run exactly once per page.

	// Is the cookiejar too full?
	eatCookies();

	loadOlcCookie(document.forms.dataContainer.isbn.value);
	
	updateForms();
	if (getCookie("olcnav")) {
		navIsOpen = getCookie("olcnav");
	}
	InitLayers();
	hideTools();
	
	// show the proper sitemap page, if that's the current page:
	if (window.document.forms.hiddenSitemapData) {
		oldSitemapPage = window.document.forms.hiddenSitemapData.firstResourceLayer.value;
		startSiteMap();
	}

	// show any necessary alerts from the login or prefs systems:
	showSMSalerts(); 

	// start the page monitor...
	if (intervalID == 0) {
		intervalID = setInterval("Monitor()",10);
	}
	pageHasLoaded = 1;
	loadBlueKaiJS();
}

function InitLayers() {
	// This function is called often; for functions that should be called
	// only on the initial page load, use PageLoad() instead.

	// log the window width to trap resizes consistently:
	winWidth = getWindowWidth();

	if (floatNav == 2) {
		// everything floats
		floaters = ["toolbar","toolbarNologin","toolbarNocrumb","toolbarNologinNocrumb",
					"crumbText","crumbBg"
					];
		offsetFloaters = ["nav","navTE", "crumbMatchpointClosed","crumbMatchpointOpen"];
	} else {
		// same for no float or toolbar-only float, since we still need to move things
		// for the teacher's edition sometimes.
		floaters = ["toolbar","toolbarNologin","toolbarNocrumb","toolbarNologinNocrumb"];
		offsetFloaters = [];
	}
	
	// need to be able to move these offscreen immediately after page load.
	// Not all of these will be included in all sites, so test for the presence of each before 
	// trying to use them.
	toolLayers = ["toolLogin","toolProfile","toolNotes","toolSearch","toolCharacter"];
	
	
	if (teachersEdition == 1) {
		if (curNav == "nav") {curNav = "navTE"};
		hideLayer("studentEdition");
		showLayer("instructorsEdition");
	} else {
		if (curNav == "navTE") {curNav = "nav"};
		hideLayer("instructorsEdition");
		showLayer("studentEdition");
	}
	
	// Is this still needed?
	doFloat();

	// align toolbars to screen right:
	var length = window.location.href.split(".").length ;
    var isProtected = 'false';
   	if (window.location.href.split(".")[length-1] == 'htm') {
    	isProtected = 'true';
    }
    
    var newLeft = (getWindowWidth() > 475) ? getWindowWidth()- 275 : 200;
    
	//var newLeft = (getWindowWidth() > 475) ? getWindowWidth()- 590 : 200;
	setLeft("toolbar",newLeft);
	setLeft("toolbarNocrumb",newLeft);
	setLeft("toolbarNologin",newLeft);
	setLeft("toolbarNologinNocrumb",newLeft);
	showToolbar();
	if (navIsOpen == 1) {
		showLayer(curNav);
	} else {
		showLayer("crumbMatchpointClosed");
		hideLayer("crumbMatchpointOpen");
		setTop("nav",-1000);
		setTop("navTE",-1000);
	}
}

/* 
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   DHTML scripts
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/

function stopNav(myName) {
	startAnimation("glideOut('"+myName+"',"+(toolTop+navOffset)+",'showLayer(\"crumbMatchpointClosed\");hideLayer(\"crumbMatchpointOpen\");navIsOpen=0;setSessionCookie(\"olcnav\",\"0\");');");
}

function startNav() {
	navIsOpen = 1;
	showLayer(curNav);
	hideLayer("crumbMatchpointClosed");
	showLayer("crumbMatchpointOpen");
	startAnimation("glideIn('"+curNav+"',(toolTop+navOffset),'');");
	setSessionCookie("olcnav","1");
}
