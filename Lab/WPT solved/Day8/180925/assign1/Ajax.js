function display() {
   
    var data = new XMLHttpRequest();
    
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> yuvraj

=======
    
>>>>>>> 782671352c7f183f3f0f66acc85eaf10bd53752a
<<<<<<< HEAD
=======
=======
    
>>>>>>> ra
>>>>>>> yuvraj
    data.open("GET", "data.txt", true);
    
    
    data.onload = function() {
        if (this.status === 200) {
          
            document.getElementById("it").innerText = data.responseText;
        } else {
           
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> 782671352c7f183f3f0f66acc85eaf10bd53752a
=======
<<<<<<< HEAD

=======
>>>>>>> 782671352c7f183f3f0f66acc85eaf10bd53752a
=======
>>>>>>> ra
>>>>>>> yuvraj
            document.getElementById("it").innerText = "Error loading file.";
        }
    };
    

    data.send();
}
