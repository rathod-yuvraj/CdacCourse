import React, { useState } from 'react';

const Calculator = () => {
  const [num1, setNum1] = useState('');
  const [num2, setNum2] = useState('');

  const handleNum1 = (e) => setNum1(e.target.value);
  const handleNum2 = (e) => setNum2(e.target.value);

  const sum = Number(num1) + Number(num2);

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
    </div>
  );
};

export default Calculator;
