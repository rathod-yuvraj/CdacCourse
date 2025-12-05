let numbers = [12, 45, 67, 89, 23, 90, 34];

// Method 1 – Using Math.max + spread
let max1 = Math.max(...numbers);
console.log("Max (Method 1):", max1);

// Method 2 – Using loop
let max2 = numbers[0];
for (let i = 1; i < numbers.length; i++) {
    if (numbers[i] > max2) max2 = numbers[i];
}
console.log("Max (Method 2):", max2);

// Method 3 – Using reduce
let max3 = numbers.reduce((a, b) => (a > b ? a : b));
console.log("Max (Method 3):", max3);
