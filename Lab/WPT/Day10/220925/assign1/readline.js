const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function factorialLoop(n) {
  let fact = 1;
  for (let i = 1; i <= n; i++) {
    fact *= i;
    console.log("Step " + i + ": " + fact);
  }
  console.log("Final Factorial of " + n + " is: " + fact);
}

// ask user for input
rl.question("Enter a number: ", function (answer) {
  const num = parseInt(answer);
  console.log("You entered:", num);
  factorialLoop(num);
  rl.close(); // close input
});
