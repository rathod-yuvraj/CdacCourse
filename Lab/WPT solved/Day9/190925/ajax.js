$(document).ready(function(){
  $("#loadButton").click(function(){
    $("#content-area").load("external_content.html", function(responseTxt, statusTxt, xhr){
      if(statusTxt == "success")
        console.log("External content loaded successfully!");
      if(statusTxt == "error")
        console.error("Error: " + xhr.status + ": " + xhr.statusText);
    });
  });
});