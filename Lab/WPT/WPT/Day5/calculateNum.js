// declare function calculate(...a) 
// 	and display addition of data 
// 	display only odd numbers from given data 

//   call calculate function with multiple parameters 

function calculate(...a) {
    let sum = 0;
    let oddNumbers = [];
    for (let num of a) {
        sum += num;
        if (num % 2 !== 0) {
            oddNumbers.push(num);
        }
    }
    console.log("Addition of data:", sum);
    console.log("Odd numbers from given data:", oddNumbers);
}
calculate(1, 2, 3, 4, 5, 6, 7, 8, 9);
