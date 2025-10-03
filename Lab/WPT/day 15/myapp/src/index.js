import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
import reportWebVitals from './reportWebVitals';
// import Factorial from './comp';
import Conversion from './test';
// import  ChildComponent from './addition'
import Factorial from './compfactorial';
import Calculator1 from './bcalculator';
import Calculator from './cusestatemanagement';
// import TextCaseConverter from './radioupperlower';
import Counter from './counter';
import CounterWithHistory from './usestate';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    
    <Factorial number={5}></Factorial>

    <Calculator></Calculator>
  
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
