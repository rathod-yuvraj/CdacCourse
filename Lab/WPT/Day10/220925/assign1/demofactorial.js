function factorialLoop(n) {
    let fact = 1;
    for (let i = 1; i <= n; i++) {
        fact *= i;
        console.log("Step " + i + ": " + fact);
    }
    console.log("Final Factorial of " + n + " is: " + fact);
}


const num = parseInt(process.argv[2]);

console.log("You entered:", num);
factorialLoop(5);
