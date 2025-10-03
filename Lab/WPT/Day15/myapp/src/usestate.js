import React, { useState, useEffect } from 'react';

function CounterWithHistory() {
  const [count, setCount] = useState(0);
  const [history, setHistory] = useState([]);

  // This useEffect will run whenever 'count' changes.
  useEffect(() => {
    // Add the current count to the history array.
    // Using the functional update for setHistory ensures we get the latest state.
    setHistory(prevHistory => [...prevHistory, count]);
  }, [count]); // Dependency array: the effect re-runs when 'count' changes.

  const incrementCounter = () => {
    setCount(prevCount => prevCount + 1);
  };

  return (
    <div>
      <h1>Counter: {count}</h1>
      <button onClick={incrementCounter}>Increment</button>

      <h2>Counter History</h2>
      {history.length > 0 ? (
        <table>
          <thead>
            <tr>
              <th>Index</th>
              <th>Value</th>
            </tr>
          </thead>
          <tbody>
            {history.map((value, index) => (
              <tr key={index}>
                <td>{index + 1}</td>
                <td>{value}</td>
              </tr>
            ))}
          </tbody>
        </table>
      ) : (
        <p>No history yet. Increment the counter to start recording!</p>
      )}
    </div>
  );
}

export default CounterWithHistory;