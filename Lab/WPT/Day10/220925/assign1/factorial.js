// Write a recursive function in Node.js to print factorial of number 

// number accept by command line Args


function factorialLoop(n) {
    let fact = 1;
    for (let i = 1; i <= n; i++) {
        fact *= i;
        console.log("Step " + i + ": " + fact);
    }
    console.log("Final Factorial of " + n + " is: " + fact);
}
let a= process.argv[2];


factorialLoop(a);