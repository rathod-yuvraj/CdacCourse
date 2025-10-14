function display() {
   
    var data = new XMLHttpRequest();
    
<<<<<<< HEAD

=======
    
>>>>>>> 782671352c7f183f3f0f66acc85eaf10bd53752a
    data.open("GET", "data.txt", true);
    
    
    data.onload = function() {
        if (this.status === 200) {
          
            document.getElementById("it").innerText = data.responseText;
        } else {
           
<<<<<<< HEAD

=======
>>>>>>> 782671352c7f183f3f0f66acc85eaf10bd53752a
            document.getElementById("it").innerText = "Error loading file.";
        }
    };
    

    data.send();
}
