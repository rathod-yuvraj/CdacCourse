/* 
<!-- 
 * $Source: /web/cvs/olc/webapp/styles/shared/common.js,v $
 * $Revision: 1.20 $
 * $Author: mathews $
 * $Date: 2007/07/23 12:31:15 $
 * 
 * Copyright 2002 The McGraw-Hill Companies.  All Rights Reserved
 *
 * REVISION HISTORY 
 * ================
 * NOTE: CVS automatically inserts check-in comments below.  Add manually only if reqd.
 *
 * $Log: common.js,v $
 * Revision 1.20  2007/07/23 12:31:15  mathews
 * Bug 277:ResultReporter page is now returing the screen at the top of the page
 *
 * Revision 1.19  2007/07/20 16:15:44  mathews
 * Bug 276:Changed the order of emailing results to correct format.
 *
 * Revision 1.18  2007/07/06 12:41:02  mathews
 * fixed the Feedback issue: Feedback only shows if the student answers the question and there is feedback text which is not empty.
 *
 * Revision 1.17  2007/07/02 17:34:53  mathews
 * fixed bugs 270, 265.
 *
 * Revision 1.16  2007/06/28 09:25:42  mathews
 * changed the order the mail
 * changed Results Reporter to Results reporter
 *
 * Revision 1.15  2007/06/19 16:10:21  mathews
 * Changed display of Essay Quiz results from decimal values to Rounded Integer values. Hiding the display of Answer Label if the user doesnt answer the label.
 *
 * Revision 1.14  2007/05/29 14:27:10  apu
 * CSQG: Extending client side quiz grading feature for v2 core style
 *
 * Revision 1.13  2007/02/15 07:13:08  apu
 * fixes to round of percentages in results reporter and not showing correct answer tick mark for unanswered questions.
 *
 * Revision 1.12  2007/02/13 15:27:55  apu
 * Client side quiz grading:additional fixes for CSQG prototype
 *
 * Revision 1.10  2007/02/10 12:06:06  apu
 * Client side quiz grading: Essay quizzes text email changes done.
 *
 * Revision 1.9  2007/02/10 10:29:58  apu
 * Client side quiz grading: Essay quizzes hint link removed after quiz submission.
 *
 * Revision 1.8  2007/02/06 12:16:07  apu
 * Client Side Quiz Grading prototype: Feedback links removed after quiz submission.
 *
 * Revision 1.7  2007/01/25 07:18:07  apu
 * Client Side Quiz Grading prototye: removed alert and added script to hide "need a hint" link in Essay quiz results page.
 *
 * Revision 1.6  2007/01/18 13:31:03  apu
 * Client Side Quiz Grading Prototype: Added Javascript for TF,MR,MC & Essay grading, displaying the results and creating HTML and Text format mail messages.
 *
 * Revision 1.5  2004/09/07 15:56:56  akhost
 * Testing setLeft and showLayer functions now to make sure that the object is found before proceeding. Fixed for bug #2039, but this might help for other issues as well...
 *
 * Revision 1.4  2004/06/03 20:48:35  akhost
 * hideLayer now checks to see if the object style is null before changing the visibility and display values
 *
 * Revision 1.3  2004/03/02 21:48:17  daniel
 * added display attributes to showLayer and hideLayer
 *
 * Revision 1.2  2003/04/13 02:20:00  daniel
 * First version with new CVS structure; not yet fully tested
 *
 *
--> 
*/

/* 
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   Generic DHTML scripts, reusable anywhere
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/

function getObj(name) {
	if (name) {
		if (document.getElementById) {
			if (document.getElementById(name)) {
				this.obj = document.getElementById(name);
				this.style = document.getElementById(name).style;
			} else {
				// no matching object found.  Do not display an error, because this may be on purpose.
				return false;
			}
		} else if (document.all) {
			this.obj = document.all[name];
			this.style = document.all[name].style;
		} else if (document.layers) {
			this.obj = document.layers[name];
			this.style = document.layers[name];
		} else {
			// no matching object found.  Do not display an error, because this may be on purpose.
			return false;
		}
		return this;
	}
}

function getWindowWidth() {
	// how's this for a tangle of browser incompatibilities?
	if (document.body) {
		if ((typeof(document.body.clientWidth) != "undefined") && (document.body.clientWidth != 0)) {
			return document.body.clientWidth;
		} else {
			return window.innerWidth - 16;
		}
	} else {
		return window.innerWidth - 16;
	}
}

function getTop(myName) {
	var myObj = new getObj(myName);
	if (myObj.style.pixelTop) {
		return Number(myObj.style.pixelTop);
	} else {
		var testPx = myObj.style.top;
		if (typeof myObj.style.top == "string") {
			return Number(myObj.style.top.substring(0,myObj.style.top.indexOf("px")));
		} else {
			return Number(myObj.style.top);
		}
	}
}

function setTop(myName, i) {
	var myObj = new getObj(myName);
	if (myObj.style) {
		if (myObj.style.pixelTop) {
			myObj.style.pixelTop = i;
		} else {
			myObj.style.top = i;
		}
	} else {
		// error... invalid div?
	}
}

function setLeft(myName, i) {
	var myObj = new getObj(myName);
	if(myObj.style != null){
		if (myObj.style.pixelLeft) {
			myObj.style.pixelLeft = i;
		} else {
			myObj.style.left = i;
		}
	}
}

function showLayer(myName) {
	var myObj = new getObj(myName);
	if(myObj.style != null){
		myObj.style.visibility="visible";
		myObj.visibility="visible";
		myObj.style.display="inline";
	}
}

function hideLayer(myName) {
	var myObj = new getObj(myName);
	if(myObj.style != null){
		myObj.style.visibility="hidden";
		myObj.style.display="none";
	}
}

function setZindex(myName, newZindex) {
	var myObj = new getObj(myName);
	if (myObj) {
		if (myObj.style.zIndex) {
			myObj.style.zIndex = newZindex;
		} 
	}
}

var mouseX=0;
var mouseY=0;
function getMouseLoc(e) {
	if (window.Event) { // Navigator 4.0x
		mouseX = e.pageX;
		mouseY = e.pageY;
	} else { // IE, NS6
		mouseX = (window.event.clientX + document.body.scrollLeft);
		mouseY = (window.event.clientY + document.body.scrollTop);
	}
}
if (window.Event) {document.captureEvents(Event.MOUSEDOWN)}
document.onmousedown = getMouseLoc;


/* 
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   Generic cookie scripts, reusable anywhere
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/

function getCookie(cookieName) {
	var myCookie = document.cookie;
	var prefix = cookieName + "=";
	var begin = myCookie.indexOf("; " + prefix);
	if (begin == -1) {
		begin = myCookie.indexOf(prefix);
		if (begin != 0) return null;
	} else {
		begin += 2;
	}
	
	var end = myCookie.indexOf(";",begin);
	if (end == -1) end = myCookie.length;
	
	var returnString = unescape(myCookie.substring(begin + prefix.length, end));
	if (returnString) {
		return returnString;
	} else {
		return false;
	}
}

function setCookie(cookieName, cookieValue) {
	var nextyear = new Date();
	nextyear.setFullYear(nextyear.getFullYear()+1);
	document.cookie = cookieName + "=" + escape(cookieValue) + "; path=/; expires=" + nextyear.toGMTString();
}

function setSessionCookie(cookieName, cookieValue) {
	document.cookie = cookieName + "=" + escape(cookieValue) + "; path=/; ";
}

function getCookieVal(cookieName, key) {
	// parses a pipe-separated list of key=value pairs, returns the value of key or null
	if (getCookie(cookieName)) {
		var Array = getCookie(cookieName).split("\|");
		var testKey, testVal;
		for (var i = 0; i < Array.length; i++) {
			testKey = Array[i].substring(0,Array[i].indexOf("="));
			if (testKey == key) {
				return(Array[i].substring(Array[i].indexOf("=")+1,Array[i].length));
			}
		}
	}
	return "";
}

function deleteCookie(cookieName) {
	var lastyear = new Date();
	lastyear.setFullYear(lastyear.getFullYear()-1);
	
	// First try deleting without specifying a domain:
	document.cookie = cookieName + "=''; value=''; path=/; expires=" + lastyear.toGMTString();

	if (getCookie(cookieName)) {
		// that didn't work, try removing the subdomain:
		var theHost = location.host;
		var hostBits = theHost.split("\.");
		var shortHost =  "." + hostBits[hostBits.length-2] + "." + hostBits[hostBits.length-1];
		if (shortHost.indexOf(":") > -1) { 
			shortHost = shortHost.substring(0,shortHost.indexOf(":"));
		}
		document.cookie = cookieName + "=''; value=''; domain=" + shortHost + "; path=/; expires=" + lastyear.toGMTString();
	}
}

/* 
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   Form field validation routines
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/

function isEmpty(s) {
	return ((s == null) || (s.length == 0))
}

function isEmail(s) {
	if (isWhitespace(s)) return false;
	var i = 1;
	var sLength = s.length;
	while ((i < sLength) && (s.charAt(i) != "@")){ 
		i++
	}
	if ((i >= sLength) || (s.charAt(i) != "@")) return false;
	else i += 2;
	while ((i < sLength) && (s.charAt(i) != ".")){ 
		i++
	}
	if ((i >= sLength - 1) || (s.charAt(i) != ".")) return false;
	else return true;
}

function isWhitespace (s){   
	var whitespace = " \t\n\r";
	var i;
	if (isEmpty(s)) return true;
	for (i = 0; i < s.length; i++){   
		var c = s.charAt(i);
		if (whitespace.indexOf(c) == -1) return false;
	}
	return true;
}

function convertSpaces(str) {
	var out = "",flag=0;
	for (i = 0; i < str.length; i++) {
		if (str.charAt(i) != " ") {
				out += str.charAt(i);
		} else{
				out += "%20";
		}
	}
	return out;
}


/* 
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   Form focus and selection capture
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/

var focusedElement = "";	// handler so javascript can tell which form element is in focus
var selectedRange = "";

function captureFocus(myElement) {
	// to get all browsers, must trigger this with all 3 of: onChange, onClick, onFocus
	focusedElement=myElement;
	if (myElement.createTextRange) {
		selectedRange = document.selection.createRange();
	}
}

function pushSelectedChar(theChar) {
	// pops the character onto the end of the last form element that triggered captureFocus
	// (or, in IE5, places it at the selectedRange instead)
	
	if (focusedElement) {
		if (selectedRange) {
			selectedRange.text = theChar;
		} else {
			focusedElement.value = focusedElement.value + theChar;
		}
	} else {
		alert("Please click inside the field you want to add this character to.");
	}
}


/* 
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   Simplified browser sniffer. Growing more complex, though.
   
   Please avoid using this whenever possible: it's much better
   to do capability testing than version testing.  Currently, this is used for:
   - Drawer speed control (NS6 was way too slow)
   - Mouse location detection (IE5/Mac returns locations relative to the div, not the window)
   - Profile drawer (NS4 can't write profile data into the form)
   
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/

function BrowserIs () {
	var agt=navigator.userAgent.toLowerCase()
	this.agent = agt;

	this.ns    = ((agt.indexOf('mozilla')!=-1) && ((agt.indexOf('spoofer')==-1) && (agt.indexOf('compatible') == -1)));
	this.ie    = (agt.indexOf("msie") != -1);
	this.opera = (agt.indexOf("opera") != -1);

	// Mozilla always claims to be version 5. Bastards. 
	// The "real" version number is tucked away at the end of the string.
	if (this.ns && (parseInt(navigator.appVersion) == 5)) {
	
		// not only that, but different versions seem to handle substring differently???
		var versionString = agt.substring(agt.indexOf('netscape')+9);
		if (versionString.indexOf('/') == -1) {
			this.major = parseInt(versionString);
			this.minor = parseFloat(versionString);
		} else {
			this.major = parseInt(versionString.substring(1));
			this.minor = parseFloat(versionString.substring(1));
		}
	} else {
		this.major = parseInt(navigator.appVersion);
		this.minor = parseFloat(navigator.appVersion);
	}

	this.win   = ( (agt.indexOf("win")!=-1) || (agt.indexOf("16bit")!=-1) )
	this.mac    = (agt.indexOf("mac")!=-1)
}

var browserIs = new BrowserIs();


/* 
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   Querystring routines
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/

function getQueryVal(arg) {
	// checks the querystring for an argument, returns its value
	var query = location.search.substring(1);
	var pairs = query.split("&");
	for (var i=0; i < pairs.length; i++) {
		var pos = pairs[i].indexOf('=');
		if (pos == -1) continue;
		if (pairs[i].substring(0,pos) == arg) {
			return pairs[i].substring(pos+1);
			break;
		}
	}
	return false;
}


/* 
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   fix NS4 problem
   Use this from onChange handlers in layered form elements, so NS4 can access the data.
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/

function mirrorFormData(theForm,theField,theValue) {
	for (i=0;i<document.forms.length;i++) {
		if (document.forms[i].name == theForm) {
			for (j=0; j<document.forms[i].elements.length;j++) {
				if (document.forms[i].elements[j].name == theField) {
					document.forms[i].elements[j].value=theValue;
				}
			}
		}
	}
}

/* 
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  Client side TF Quiz grading prototype code.
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/

var textMail = "";
var resultsText = "";
var correctAnswerCount= 0;
var inCorrectAnswerCount = 0;
var unansweredCount = 0;

function decrypt(theText) {	
	//XOR decryption code for the feedback text and title 
	var key = 150;//Hardcoded as of Now	
	var pos = theText.indexOf(""+key);
	if(pos > 0){
		theText = theText.substring(0,pos);
		//alert("Removed key: "+ theText);
	}	
	var length = theText.length;
	output = "";
	var temp = "";
	for (i = 0; i < length; i++) {
		temp =((theText.charCodeAt(i) ^ key));
		output += String.fromCharCode(temp);
	}	
	//alert(output);
	return output;
}

//*******************************************************************
//Quiz parameter objects
function makeQuestionObject(questionId,questionTitle,questionText){

	this.questionId = questionId;
	this.questionTitle = questionTitle;
	this.questionText = questionText;

}

function makeAnswerObject(answerId,answerText){

	this.answerId = answerId;
	this.answerText = answerText;
	
}
//*******************************************************************


function gradeQuizTest(QuestionObjArray){	

	var user_answers = createUserAnswerChoicesArray((QuestionObjArray.length));	
	//unansweredCount = (QuestionObjArray.length-1) - user_answers.length;
	
	for(var i = 1;i < QuestionObjArray.length; i++ ){
		
		var question = QuestionObjArray[i];
		var answerObjArray = question.answerObjectsArray;	
		
		//alert("Answer Objects Array "+ question.answerObjectsArray);
		//alert("AnswerObjectArraysize " + answerObjArray.length);//length is 3 for some reason beyond my understanding. Should be 2
			
		for (var k = 0; k < user_answers.length; k++){
			var userAnswerId = user_answers[k];
			
			for(var j = 1; j < answerObjArray.length; j++){
				
				var answerId = answerObjArray[j].answerId;
											 
				if(userAnswerId == answerId){						
					QuestionObjArray[i].isSelected = "true";
					answerObjArray[j].isSelected = "true";
					//alert("counting");					
				}
			}
		}
			
	}
	return QuestionObjArray;
}
	
function outputEmailForm() {
//display hidden Email Form
document.getElementById('email_form').style.display = 'block';

}

function printResults(QuestionObjArray) {
		//function for creating the results reporter and summary, also calls the function which creates the results page main body and email form
		for(var i = 1;i <QuestionObjArray.length; i++ ){
			var question = QuestionObjArray[i];
			var answerObjectsArray = question.answerObjectsArray;
	 		displayResults(question, i);
		}
				
	 	var result;
		var pc_correct = (correctAnswerCount/(QuestionObjArray.length -1))*100;
		var pc_incorrect = (inCorrectAnswerCount/(QuestionObjArray.length -1))*100;
		var pc_unanswered = (unansweredCount/(QuestionObjArray.length -1))*100;
		document.getElementById('res_desc').style.display = 'block';
		document.getElementById('your_results').style.display = 'block';
		document.getElementById('res_desc').childNodes[0].childNodes[0].childNodes[0].innerHTML="<h1>Results Reporter</h1>";
		document.getElementById('res_desc').childNodes[0].childNodes[2].childNodes[0].innerHTML= "Out of " + (QuestionObjArray.length - 1)+" questions, you answered " +correctAnswerCount+
		 " correctly with a final grade of "+ Math.round(pc_correct) + "%";
	 	document.getElementById('res_desc').childNodes[0].childNodes[4].childNodes[1].innerHTML= correctAnswerCount   +  " correct ("+Math.round(pc_correct) +"%)";
	 	document.getElementById('res_desc').childNodes[0].childNodes[4].childNodes[2].innerHTML= "<img src='/olcweb/styles/shared/bargraph.gif' height='14' width='"+pc_correct+"%'/>";
	 	document.getElementById('res_desc').childNodes[0].childNodes[5].childNodes[1].innerHTML= inCorrectAnswerCount   +  " incorrect ("+Math.round(pc_incorrect) +"%)";
	 	document.getElementById('res_desc').childNodes[0].childNodes[5].childNodes[2].innerHTML= "<img src='/olcweb/styles/shared/bargraph.gif' height='14' width='"+pc_incorrect+"%'/>";
	 	document.getElementById('res_desc').childNodes[0].childNodes[6].childNodes[1].innerHTML= unansweredCount   +  " unanswered ("+Math.round(pc_unanswered) +"%)";
	 	document.getElementById('res_desc').childNodes[0].childNodes[6].childNodes[2].innerHTML= "<img src='/olcweb/styles/shared/bargraph.gif' height='14' width='"+pc_unanswered+"%'/>";
	 	
	 	textMail += "Results Reporter"+"\n\n\n";
	 	textMail += "================================================================"+"\n";	 	
        textMail += "Out of " + (QuestionObjArray.length - 1)+" questions, you answered " +correctAnswerCount+" correctly with a final grade of "+ pc_correct + "% "+"\n\n";
	 	textMail += correctAnswerCount + " correct ("+pc_correct +"%) "+"\n";
	 	textMail += inCorrectAnswerCount + " incorrect ( "+pc_incorrect +"%) "+"\n";
	 	textMail += unansweredCount + " unanswered ( "+pc_unanswered +"%) "+"\n";
	 	textMail += "================================================================"+"\n";
	 	textMail += "YOUR RESULTS: "+ "\n\n";
	 	textMail += "================================================================"+"\n";
	 	textMail += "\n" + resultsText;
	 	//alert(textMail);
	 	outputEmailForm();//call for creating the email form.
	 	var html = document.getElementById('emailHTML').innerHTML;
	 	document.forms.frmMail.htmlEmail.value = html;
	 	document.forms.frmMail.textEmail.value = textMail;
	 	
	 	//alert("Email HTML"+document.forms.frmMail.htmlEmail.value);
	 	//alert("Email HTML"+document.forms.frmMail.textEmail.value);
		
	
	}
	
function getCorrectAnswerforQuestion(Question){
	//function for creating an array of correct answers for a question
	var answerObjectsArray = Question.answerObjectsArray;
	var correctAnswers = new Array();	
	for(var i = 1; i < answerObjectsArray.length; i++){	
		var decryptedFeedbackTitle = decrypt(answerObjectsArray[i].feedBackTitle);//decrypting the feedbact title
		//alert("Decrypted FBT: "+decryptedFeedbackTitle);
		if(decryptedFeedbackTitle == "Correct Answer"){	
			answerObjectsArray[i].isCorrect = "true";	
			correctAnswers.push(answerObjectsArray[i]);		
		}	
	}
	//alert("Size "+correctAnswers.length);
	return correctAnswers;
	 
}

	
function getSelectedAnswerforQuestion(Question){
	//function for creating an array of user selected answer
	var answerObjectsArray = Question.answerObjectsArray;
	var selectedAnswers = new Array();	
	for(var i = 1; i < answerObjectsArray.length; i++){						
		if(answerObjectsArray[i].isSelected == "true"){
			selectedAnswers.push(answerObjectsArray[i]);			
		}			
	}
	//alert("Size selected "+selectedAnswers.length);
	return selectedAnswers;
	
}

function displayResults(Question, iter){
		//function for displaying the results for TF,MC,MR (main body)
		var selectedAnswer = getSelectedAnswerforQuestion(Question);		
		var correctAnswer = getCorrectAnswerforQuestion(Question);
		var answerObjectsArray = Question.answerObjectsArray;
		var count = 0;
		var choice;		
		//grading logic for TF,MR, MC
		if(selectedAnswer.length != 0){
			if(selectedAnswer.length != correctAnswer.length ){
				choice = "INCORRECT";		
			}else{		
				for(var j = 0; j < selectedAnswer.length;j++){	
					if((selectedAnswer[j].answerId) == (correctAnswer[j].answerId)){
						count++;
					}
					else{
						count--;
					}
				}
				 //alert("COUNT" + count);
				if(count == selectedAnswer.length){//for MR quizzes, all selected answers should be correct.Using a counter for this.
					choice = "CORRECT";				
				}else{				
					choice = "INCORRECT";
				}
			}
		}else{			
			choice = "UNANSWERED";		
		}
		
		
		if (choice == "CORRECT"){
			correctAnswerCount++;
		}else if(choice == "INCORRECT") {
			inCorrectAnswerCount++;
		}else{
			unansweredCount++;		
		}
		
		//alert("Choice "+choice);
		disableChoices();//disables input fields for the quiz form	
		if(document.getElementById('hintLink'+iter)){
			document.getElementById('hintLink'+iter).style.display = 'none';
		}
		document.getElementById('quest'+iter).style.width = "130px";
		document.getElementById('quest'+iter).innerHTML = iter+ "  "+choice;
		resultsText += choice+"\n";
		resultsText += iter+": "+Question.questionText+"\n";
		var num;
		for (var i=1; i < answerObjectsArray.length; i++){			
			if(i==1){
			num="a";
			resultsText += "     "+num+". "+answerObjectsArray[i].answerText + "\n";	
			}
			if(i==2){
			num="b";
			resultsText += "     "+num+". "+answerObjectsArray[i].answerText + "\n";	
			}
			if(i==3){
			num="c";
			resultsText += "     "+num+". "+answerObjectsArray[i].answerText + "\n";	
			}
			if(i==4){
			num="d";
			resultsText += "     "+num+". "+answerObjectsArray[i].answerText + "\n";	
			}
			
				
		}		
		for(var i = 0; i < correctAnswer.length; i++ ){			
			try{
				if(choice != "UNANSWERED"){
						document.getElementById(correctAnswer[i].answerId).innerHTML = "<img src='/olcweb/styles/v2_glencoe/images/correct.gif'/>";}
					}
			catch(err){
				continue;
			}
		}
		
		if(selectedAnswer != 0){
			var feedbackText = document.getElementById("feedback"+iter);
		
			for(var i = 0; i < selectedAnswer.length; i++)
				try{
				    resultsText += "Your Answer: " + selectedAnswer[i].answerText+"\n";
					if(decrypt(selectedAnswer[i].feedBackText)!= null && decrypt(selectedAnswer[i].feedBackText) != "") {
				        feedbackText.innerHTML  += "Feedback: " + decrypt(selectedAnswer[i].feedBackText)+"</br>";//use decrypt here
						resultsText += 	"Feedback: " + decrypt(selectedAnswer[i].feedBackText)+"\n";//use decrypt here
						resultsText += "\n"	;
					}
				}catch(err){
					continue;				
				}
		}
	
}

function disableChoices(){
		//disable the quiz form input fields
		document.getElementById('grade_quiz_button').innerHTML = "";
		var length = document.forms.quizform.getElementsByTagName('input').length;
		for(var i = 0;i<length;i++){
			document.forms.quizform.getElementsByTagName('input')[i].disabled = true;
		}
}
	

function gradeAndShowResults(QuestionObjArray){
	//ENTRY POINT FOR QUIZ SUBMISSION FUNCTION CALLS	
	var f = window.frames["logQuizSubmission"];
	var TOQ;
	if(f.logQuizSubmission){
		var url = window.location;
		var isbn = document.forms.quizform.isbn.value;		
		var quizType = document.forms.quizform.QuizName.value;	
		f.logQuizSubmission(isbn,url,quizType);//Logging quiz submission
	}
	TOQ = document.forms.quizform.TypeOfQuiz.value;
	//alert("TOQ: "+TOQ);
	if(TOQ != 5){//follow different grading logic for Essay type quizzes
		gradeQuizTest(QuestionObjArray);
		printResults(QuestionObjArray);
	}else {
		gradeEssayQuiz(QuestionObjArray);	
	}
}

var essayText;
var essaysTaken = 0;
var EssayQuizResultsText = "";
var EssayEmailResultsText = "";

function gradeEssayQuiz(QuestionObjArray){
	//function for  displaying the Results Reporter and summary  also calls the function which creates the results page main body and email form
	for(var i = 1;i <QuestionObjArray.length; i++ ){	
		var question = QuestionObjArray[i];					
	 	displayEssayResults(question, i);	 		
	}
	var unAnswered =((QuestionObjArray.length-1) - essaysTaken);
	var answered = essaysTaken;
	var pc_answered = (essaysTaken/(QuestionObjArray.length-1))*100;
	var pc_unanswered = (unAnswered/(QuestionObjArray.length-1))*100;
	document.getElementById('res_desc').style.display = 'block';
	document.getElementById('your_results').style.display = 'block';
	document.getElementById('res_desc').childNodes[0].childNodes[0].childNodes[0].innerHTML="<h1>Results Reporter</h1>";
	document.getElementById('res_desc').childNodes[0].childNodes[4].childNodes[1].innerHTML= unAnswered+" unanswered ("+ Math.round(pc_unanswered) +"%)";
 	document.getElementById('res_desc').childNodes[0].childNodes[4].childNodes[2].innerHTML= "<img src='/olcweb/styles/shared/bargraph.gif' height='14' width='"+pc_unanswered+"%'/>";
 	document.getElementById('res_desc').childNodes[0].childNodes[5].childNodes[1].innerHTML= answered + " ungraded (" + Math.round(pc_answered) + "%)";
 	document.getElementById('res_desc').childNodes[0].childNodes[5].childNodes[2].innerHTML= "<img src='/olcweb/styles/shared/bargraph.gif' height='14' width= '"+pc_answered+"%' />";
	
	EssayQuizResultsText += "Results Reporter"+"\n\n";
	EssayQuizResultsText += "================================================================"+"\n";	 	
	EssayQuizResultsText += "YOUR RESULTS: "+ "\n\n";
	EssayQuizResultsText += "================================================================"+"\n";
	EssayQuizResultsText += unAnswered+" unanswered ("+ pc_unanswered +"%)"+"\n";
	EssayQuizResultsText += answered + " ungraded (" + pc_answered + "%)"+"\n";
	EssayQuizResultsText += "================================================================"+"\n";	 
	EssayQuizResultsText += EssayEmailResultsText;
 	outputEmailForm();
 	var html = document.getElementById('emailHTML').innerHTML;
	document.forms.frmMail.htmlEmail.value = html;
	document.forms.frmMail.textEmail.value = EssayQuizResultsText;
	//alert("Email HTML"+document.forms.frmMail.htmlEmail.value);
	//alert(document.forms.frmMail.textEmail.value);
}
function displayEssayResults(question, iter){
	//function to display Essay results
	essayText = document.getElementsByName('Answer'+iter)[0].value;//collect essay text area value
	var answered = "UNANSWERED";
	var answerObjectsArray = question.answerObjectsArray;	
	
	if(essayText!=""){		
		answered = "NOT GRADED";
		if(decrypt(answerObjectsArray[1].feedBackText) != "") {
			document.getElementById("feedback"+iter).innerHTML = "FeedBack:  "+decrypt(answerObjectsArray[1].feedBackText);	
		}
		essaysTaken++;
	}
  	disableChoices();
  	if(document.getElementById('hintLink'+iter)){
		document.getElementById('hintLink'+iter).style.display = 'none';
	}
	document.getElementById('quest'+iter).style.width = "130px";
	document.getElementById('quest'+iter).innerHTML = iter+ "  "+answered;
	EssayEmailResultsText += answered+"\n";
	EssayEmailResultsText += iter+ ". "  +question.questionText+"\n";
	if(essayText!="") {
		document.getElementById('EssayTextArea'+iter).innerHTML = "<b>Your Answer</b>:   " + essayText;
	}
	
	EssayEmailResultsText += "Your Answer: "+essayText+"\n";
	EssayEmailResultsText += "FeedBack:  "+ decrypt(answerObjectsArray[1].feedBackText)+"\n\n";	
}

function createUserAnswerChoicesArray(noOfQuestions){
	//function that creates the user answer choices(works for TF,MC&MR)
   var array = new Array(); 
   var loop;
   var unAnsweredId;
   
   for(var x =0;x<noOfQuestions;x++){
		loop = "Answer"+(x+1);
				
		if(eval('document.quizform.'+loop)) {			
			var d =eval('document.quizform.'+loop+'.length');
			
			var flag = 0;
			for(var i = 0;i<d;i++){
		
				if(eval('document.quizform.'+loop)) {
					if(eval('document.quizform.'+loop+'[i].checked'))
					{
					flag =1;
					//array[x] = eval('document.quizform.'+loop+'[i].value');
					
					array.push(eval('document.quizform.'+loop+'[i].value'));
					
					
					}
				}
			}
			
			if (flag ==0){
				unAnsweredId = loop;
			}
		}
   }
   //alert("Array Size: " + array.length);
	return array;
}
function scrollTops(){
document.body.scrollTop=0;
}

