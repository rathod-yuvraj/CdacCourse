import React, { useState } from "react";

function Factorial() {
  const [uFact, setFact] = useState(1);
  const [length, setLength] = useState(5);
  const calculateFactorial = (num) => {
    
    let fact = 1;
    for (let i = 1; i <= num; i++) {
      fact *= i;
    }
    return fact;
  };

  const handleClick = () => {
    setFact(calculateFactorial(length));
  };

  return (
    <div>
        <label>
            Enter the number:
        </label>
        <input 
         type="number"
          value={length}
          onChange={(e) => setLength(parseInt(e.target.value))}
        ></input>
      <h1>Factorial of {length}: {uFact}</h1>
      <button onClick={handleClick}>Calculate</button>
    </div>
  );
}

export default Factorial;
