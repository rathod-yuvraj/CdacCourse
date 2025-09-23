function display() {
   
    var data = new XMLHttpRequest();
    
    // Specify the request method and the path to the text file (change this path to your actual file)
    data.open("GET", "data.txt", true);
    
    // Set up a callback function to handle the response
    data.onload = function() {
        if (data.status === 200) {
            // If the request was successful, display the text in the <p> tag with id 'it'
            document.getElementById("it").innerText = data.responseText;
        } else {
            // If the request failed, show an error message
            document.getElementById("it").innerText = "Error loading file.";
        }
    };
    
    // Send the request
    data.send();
}
