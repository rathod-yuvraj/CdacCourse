// Display Timer on Browser using callback function setInterval
function displayTime() {
    let dateTime = new Date();
    let time = dateTime.toLocaleTimeString();
    console.log(time);
    document.getElementById("timer").innerText = time;
}
setInterval(displayTime, 1000);
// The displayTime function is called every 1000 milliseconds (1 second) to update the time displayed on the browser.
// Make sure to have an HTML element with id "timer" in your HTML file to see the time update.
// Example HTML element: <div id="timer"></div>
// This code will log the current time to the console and update the inner text of the HTML element with id "timer" every second.

// callback function all methods
// 1. Function as an argument to another function
function greet(name, callback) {
    console.log("Hello " + name);
    callback();
}
function callMe() {
    console.log("I am callback function");
}
greet("John", callMe);
// 2. Function returning another function
function outerFunction() {
    return function innerFunction() {   
        console.log("I am inner function");
    }
}
let innerFunc = outerFunction();
innerFunc();
// 3. Using setTimeout
setTimeout(function() {
    console.log("This message is shown after 2 seconds");
}
, 2000);
// 4. Using setInterval
let count = 0;
let intervalId = setInterval(function() {
    count++;
    console.log("Count: " + count);
    if (count === 5) {
        clearInterval(intervalId); // Stop the interval after 5 counts
    }
}, 1000);
// 5. Event Listener
document.getElementById("myButton").addEventListener("click", function() {
    console.log("Button was clicked!");
});
// Make sure to have an HTML element with id "myButton" in your HTML file to see the event listener in action.
// Example HTML element: <button id="myButton">Click Me</button>    
// This code will log a message to the console when the button is clicked.  
