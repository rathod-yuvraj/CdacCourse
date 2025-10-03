import React, { useState, useEffect } from "react";

export default function Calculator({ num1, num2, operation }) {
  const [result, setResult] = useState(null);

  useEffect(() => {
    let res;
    switch (operation) {
      case "add":
        res = num1 + num2;
        break;
      case "subtract":
        res = num1 - num2;
        break;
      case "multiply":
        res = num1 * num2;
        break;
      case "divide":
        res = num2 !== 0 ? num1 / num2 : "Cannot divide by zero";
        break;
      default:
        res = "Invalid Operation";
    }
    setResult(res);
  }, [num1, num2, operation]);

  return (
    <div>
      <h3>Calculator</h3>
      <p>
        Operation: <strong>{operation}</strong>
      </p>
      <p>
        Result: <strong>{result !== null ? result : "No calculation yet"}</strong>
      </p>
    </div>
  );
}
