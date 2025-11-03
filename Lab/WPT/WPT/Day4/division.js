// Write a function to divide two numbers and assign function to a variable

let divide = function(a, b) {
    if (b === 0) {
        console.log("Error: Division by zero is not allowed.");
        return null;
    }
    return a / b;
};

let result = divide(20, 4);
console.log("Division of two numbers: " + result);

// Write a function to divide three numbers and print the value
function divideThreeNumbers(x, y, z) {
    if (y === 0 || z === 0) {
        console.log("Error: Division by zero is not allowed.");
        return;
    }
    let result = x / y / z;
    console.log("Division of three numbers: " + result);
}
divideThreeNumbers(100, 5, 2);

// Write a function to divide four numbers and return the value