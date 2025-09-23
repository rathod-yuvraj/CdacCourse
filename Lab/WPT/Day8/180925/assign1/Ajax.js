function display() {
   
    var data = new XMLHttpRequest();
    
<<<<<<< HEAD
    // Specify the request method and the path to the text file (change this path to your actual file)
    data.open("GET", "data.txt", true);
    
    // Set up a callback function to handle the response
    data.onload = function() {
        if (data.status === 200) {
            // If the request was successful, display the text in the <p> tag with id 'it'
            document.getElementById("it").innerText = data.responseText;
        } else {
            // If the request failed, show an error message
=======
    
    data.open("GET", "data.txt", true);
    
    
    data.onload = function() {
        if (this.status === 200) {
          
            document.getElementById("it").innerText = data.responseText;
        } else {
           
>>>>>>> ba584d70e23d9f6944e87aaadfc44d20127048f1
            document.getElementById("it").innerText = "Error loading file.";
        }
    };
    
<<<<<<< HEAD
    // Send the request
=======

>>>>>>> ba584d70e23d9f6944e87aaadfc44d20127048f1
    data.send();
}
