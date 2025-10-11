// Write a Program to use Different Array Library Functions using switch case

let arr = [1, 2, 3, 4, 5];

function arrayLibrary() {
    let choice = parseInt(prompt("Enter your choice:\n1. Push\n2. Pop\n3. Shift\n4. Unshift\n5. Slice\n6. Splice\n7. IndexOf\n8. LastIndexOf\n9. Join\n10. Concat\n11. Reverse\n12. Sort"));
    switch (choice) {
        case 1: 
            let pushElement = parseInt(prompt("Enter element to push:"));
            arr.push(pushElement);
            console.log("After Push: " + arr);
            break;
        case 2:
            arr.pop();
            console.log("After Pop: " + arr);
            break;
        case 3:
            arr.shift();
            console.log("After Shift: " + arr);
            break;
        case 4:
            let unshiftElement = parseInt(prompt("Enter element to unshift:"));
            arr.unshift(unshiftElement);
            console.log("After Unshift: " + arr);
            break;
        case 5:
            let start = parseInt(prompt("Enter start index for slice:"));
            let end = parseInt(prompt("Enter end index for slice:"));
            console.log("Sliced Array: " + arr.slice(start, end));
            break;
        case 6:
            let spliceStart = parseInt(prompt("Enter start index for splice:"));
            let spliceDeleteCount = parseInt(prompt("Enter number of elements to delete:"));
            let spliceElements = prompt("Enter elements to add (comma separated):").split(',').map(Number);
            arr.splice(spliceStart, spliceDeleteCount, ...spliceElements);
            console.log("After Splice: " + arr);
            break;
        case 7:
            let indexOfElement = parseInt(prompt("Enter element to find index of:"));
            console.log("Index Of " + indexOfElement + ": " + arr.indexOf(indexOfElement));
            break;
        case 8:
            let lastIndexOfElement = parseInt(prompt("Enter element to find last index of:"));
            console.log("Last Index Of " + lastIndexOfElement + ": " + arr.lastIndexOf(lastIndexOfElement));
            break;
        case 9:
            let joinSeparator = prompt("Enter separator for join:");
            console.log("Joined Array: " + arr.join(joinSeparator));
            break;
        case 10:
            let concatArray = prompt("Enter array to concatenate (comma separated):").split(',').map(Number);
            console.log("Concatenated Array: " + arr.concat(concatArray));
            break;
        case 11:
            arr.reverse();
            console.log("Reversed Array: " + arr);
            break;
        case 12:
            arr.sort((a, b) => a - b);
            console.log("Sorted Array: " + arr);
            break;
        default:
            console.log("Invalid Choice");
    }
    

}