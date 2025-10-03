function calculate(...a) {
    // Display the received data
    console.log("Received data:", a);

    // 1. Calculate and display the sum
    let sum = a.reduce((acc, val) => acc + val, 0);
    console.log("Sum:", sum);
ers
    let oddNumbers = a.filter(num => num % 2 !== 0);
    console.log("Odd numbers:", oddNumbers);
}


calculate(10, 3, 5, 8, 7, 2, 13);
