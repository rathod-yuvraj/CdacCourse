let arr = [10, 20, 30, 40, 50];
let choice = "MAP";  // Try: PUSH, POP, MAP, FILTER, REDUCE

switch (choice) {
    case "PUSH":
        arr.push(60);
        console.log("After Push:", arr);
        break;

    case "POP":
        arr.pop();
        console.log("After Pop:", arr);
        break;

    case "MAP":
        let squared = arr.map(x => x * x);
        console.log("Squares:", squared);
        break;

    case "FILTER":
        let even = arr.filter(x => x % 2 === 0);
        console.log("Even numbers:", even);
        break;

    case "REDUCE":
        let sum = arr.reduce((a, b) => a + b, 0);
        console.log("Sum:", sum);
        break;

    default:
        console.log("Invalid choice!");
}
