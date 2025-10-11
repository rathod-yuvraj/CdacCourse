function display() {
   
    var data = new XMLHttpRequest();
    
    
    data.open("GET", "data.txt", true);
    
    
    data.onload = function() {
        if (this.status === 200) {
          
            document.getElementById("it").innerText = data.responseText;
        } else {
           
            document.getElementById("it").innerText = "Error loading file.";
        }
    };
    

    data.send();
}
