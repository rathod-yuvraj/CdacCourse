import React from "react";

export default function Factorial({ number }) {
  // Function to calculate factorial recursively
  function factorial(n) {
    
  if (n < 0) return undefined; // Factorial does not exist for negative numbers
  if (n === 0) return 1;       // Base case: 0! is 1
  return n * factorial(n - 1); // Recursive case
  }

  

  return (
    <div>
      <h3>Factorial Calculator</h3>
      <p>
        Factorial of {number} is {factorial(number)}
      </p>
    </div>
  );
}
