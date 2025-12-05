function display(result) {
    document.getElementById("cal").innerHTML = result;
}

function addition(a, b, displayCall) {
    let result = a + b;
    displayCall(result);
}

function subtraction(a, b, displayCall) {
    let result = a - b;
    displayCall(result);
}

function multiply(a, b, displayCall) {
    let result = a * b;
    displayCall(result);
}

function division(a, b, displayCall) {
    if (b === 0) {
        displayCall("Error: Division by zero");
    } else {
        let result = a / b;
        displayCall(result);
    }
}

function calculations(a, b, operationCallback) {
    operationCallback(a, b, display);
}

function performCalculations() {
    let num1 = parseFloat(prompt("Enter the first number:"));
    let num2 = parseFloat(prompt("Enter the second number:"));
    let operation = prompt("Enter the operation to perform (add, sub, mul, div):");

    switch (operation) {
        case "add":
            calculations(num1, num2, addition);
            break;
        case "sub":
            calculations(num1, num2, subtraction);
            break;
        case "mul":
            calculations(num1, num2, multiply);
            break;
        case "div":
            calculations(num1, num2, division);
            break;
        default:
            display("Invalid operation");
            break;
    }
}
