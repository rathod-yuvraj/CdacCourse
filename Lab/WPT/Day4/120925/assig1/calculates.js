function calculate(...a) {
  
  let sum = a.reduce((acc, val) => acc + val, 0);
  console.log("Sum:", sum);

  let oddNumbers = a.filter(num => num % 2 !== 0);
  console.log("Odd Numbers:", oddNumbers);
}


calculate(10, 23, 44, 55, 68, 77);
