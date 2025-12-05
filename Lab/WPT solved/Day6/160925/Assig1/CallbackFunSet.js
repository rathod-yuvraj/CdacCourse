setTimeout(function () {
  console.log("This runs after 3 seconds");
}, 3000); 
const intervalId = setInterval(function () {
  console.log("This runs every 2 seconds");
}, 2000);
let count = 0;
const intervalId = setInterval(function () {
  count++;
  console.log(`Count: ${count}`);

  if (count === 5) {
    clearInterval(intervalId);
    console.log("Stopped the interval after 5 times");
  }
}, 1000); // runs every 1 second
const intervalId = setInterval(() => {
  console.log("Running...");
}, 1000);

setTimeout(() => {
  clearInterval(intervalId);
  console.log("Interval cleared after 5 seconds");
}, 5000);

