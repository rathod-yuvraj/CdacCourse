import React from "react";

export default function Calculator1({ num1, num2 }) {
  return (
    <div>
      <h3>Calculator Operations</h3>
      <p>Addition: {num1 + num2}</p>
      <p>Subtraction: {num1 - num2}</p>
      <p>Multiplication: {num1 * num2}</p>
      <p>Division: {num2 !== 0 ? (num1 / num2) : "Cannot divide by zero"}</p>
    </div>
  );
}
