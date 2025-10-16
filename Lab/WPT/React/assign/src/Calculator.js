import React, { useState } from 'react';

const Calculator = () => {
  const [num1, setNum1] = useState('');
  const [num2, setNum2] = useState('');

  const handleNum1 = (e) => setNum1(e.target.value);
  const handleNum2 = (e) => setNum2(e.target.value);

  const sum = Number(num1) + Number(num2);
<<<<<<< HEAD
=======
  const sub = Number(num1) - Number(num2);
  const mul = Number(num1) * Number(num2);
  const div = Number(num1) / Number(num2);
>>>>>>> 32558f955f463af33c75ee82b0c9ba8fe2153e5a

  return (
    <div>
      <h2>Simple Calculator</h2>
      <input
        type="number"
        value={num1}
        onChange={handleNum1}
        placeholder="Enter first number"
      />
      <input
        type="number"
        value={num2}
        onChange={handleNum2}
        placeholder="Enter second number"
      />
      <p>Sum: {sum}</p>
<<<<<<< HEAD
=======
      <p>Sub: {sub}</p>
      <p>Mul: {mul}</p>
      <p>Div: {div}</p>
      
>>>>>>> 32558f955f463af33c75ee82b0c9ba8fe2153e5a
    </div>
  );
};

export default Calculator;
