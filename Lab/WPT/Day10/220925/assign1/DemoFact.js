// factorial.js

// Recursive function
function factorial(n) {
    if (n === 0 || n === 1) {
        return 1;
    }
    return n * factorial(n - 1);
}

// Read number from command line arguments
const num = parseInt(process.argv[2]);

if (isNaN(num) || num < 0) {
    console.log("Please enter a valid non-negative integer.");
} else {
    console.log(`Factorial of ${num} is: ${factorial(num)}`);
}
