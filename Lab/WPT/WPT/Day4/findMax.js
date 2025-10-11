
//  To Find max number from array write code in 3 ways as shown in lecture
// 1. Using for loop
// 2. Using while loop  
// 3. Using sort function
// 4. Using Math.max function
// 5. Using reduce function 
function findMaxUsingForLoop(arr) {
    let max = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }   
    }
    return max;
}
let arr1 = [3, 5, 7, 2, 8];
console.log("Max using for loop: " + findMaxUsingForLoop(arr1));
function findMaxUsingWhileLoop(arr) {
    let max = arr[0];
    let i = 1;
    while (i < arr.length) {
        if (arr[i] > max) {
            max = arr[i];
        }
        i++;
    }
    return max;
}
let arr2 = [10, 20, 5, 30, 15];
console.log("Max using while loop: " + findMaxUsingWhileLoop(arr2));
function findMaxUsingSort(arr) {
    let sortedArr = arr.slice().sort((a, b) => b - a);
    return sortedArr[0];
}
let arr3 = [1, 4, 2, 9, 6];
console.log("Max using sort: " + findMaxUsingSort(arr3));
function findMaxUsingMathMax(arr) {
    return Math.max(...arr);
}
let arr4 = [12, 25, 7, 19, 30];
console.log("Max using Math.max: " + findMaxUsingMathMax(arr4));
function findMaxUsingReduce(arr) {
    return arr.reduce((max, current) => (current > max ? current : max), arr[0]);
}
let arr5 = [14, 3, 27, 8, 22];
console.log("Max using reduce: " + findMaxUsingReduce(arr5));




function findMax(){
    let arr =[1,2,3,54,7,6,9,8];
    let max=arr[0];
    for(let i=1;i<arr.length;i++){
        if(arr[i]>max){

            max=arr[i];
        }
    }
    console.log("Max value is "+max);

    for(let i=0;i<arr.length;i++){

        console.log(arr[i]);
    }
}

findMax();

//  To Find max number from array write code in 3 ways as shown in lecture 

// 2. Using while loop
// 3. Using sort function
// 4. Using Math.max function
// 5. Using reduce function
// 6. Using spread operator
// 7. Using apply function
// 8. Using forEach function
// 9. Using map function
// 10. Using filter function
// 11. Using for..of loop
// 12. Using for..in loop
// 13. Using recursion
// 14. Using ternary operator
// 15. Using destructuring assignment
// 16. Using Set    

// 1. Using for loop
// function findMaxUsingForLoop(arr) {
//     let max = arr[0];
//     for (let i = 1; i < arr.length; i++) {
//         if (arr[i] > max) {
//             max = arr[i];
//         }
//     }
//     return max;
// }
// let arr1 = [3, 5, 7, 2, 8];
// console.log("Max using for loop: " + findMaxUsingForLoop(arr1));
// 2. Using while loop
// function findMaxUsingWhileLoop(arr) {
//     let max = arr[0];        
//     let i = 1;
//     while (i < arr.length) {
//         if (arr[i] > max) {
//             max = arr[i];
        // }
//         i++;
//     }
//     return max;
// }
// let arr2 = [10, 20, 5, 30, 15];
// console.log("Max using while loop: " + findMaxUsingWhileLoop(arr2));
// 3. Using sort function
// function findMaxUsingSort(arr) {
//     let sortedArr = arr.slice().sort((a, b) => b - a);
//     return sortedArr[0];
// }
// let arr3 = [1, 4, 2, 9, 6];
// console.log("Max using sort: " + findMaxUsingSort(arr3));
// 4. Using Math.max function
// function findMaxUsingMathMax(arr) {
//     return Math.max(...arr);
// }    
// let arr4 = [12, 25, 7, 19, 30];
// console.log("Max using Math.max: " + findMaxUsingMathMax(arr4));
// 5. Using reduce function
// function findMaxUsingReduce(arr) {
//     return arr.reduce((max, current) => (current > max ? current : max), arr[0]);
// }
// let arr5 = [14, 3, 27, 8, 22];
// console.log("Max using reduce: " + findMaxUsingReduce(arr5));
// 6. Using spread operator
// function findMaxUsingSpread(arr) {
//     return Math.max(...arr);
// }
// let arr6 = [11, 29, 5, 17, 23];
// console.log("Max using spread operator: " + findMaxUsingSpread(arr6));
// 7. Using apply function
// function findMaxUsingApply(arr) {
//     return Math.max.apply(null, arr);
// }
// let arr7 = [13, 21, 4, 18, 26];
// console.log("Max using apply function: " + findMaxUsingApply(arr7));
// 8. Using forEach function
// function findMaxUsingForEach(arr) {
//     let max = arr[0];
//     arr.forEach(num => {
//         if (num > max) {
//             max = num;
        // }
//     });
//     return max;
// }
// let arr8 = [15, 2, 28, 9, 24];
// console.log("Max using forEach function: " + findMaxUsingForEach(arr8));
// 9. Using map function
// function findMaxUsingMap(arr) {
//     let max = arr[0];
//     arr.map(num => {
//         if (num > max) {
//             max = num;
        // }
//     });
//     return max;
// }
// let arr9 = [16, 3, 30, 7, 20];
// console.log("Max using map function: " + findMaxUsingMap(arr9));





