// Declare Array with String Data 
// 	display every element in uppercase format
//              (use prdefined methods of String)
let arr = ["apple", "banana", "cherry", "date", "elderberry"];
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i].toUpperCase());
}
// 	display every element in lowercase format
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i].toLowerCase());
}
// 	display length of each element
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i].length);
}
// 	display elements which have length > 4
for (let i = 0; i < arr.length; i++) {
    if (arr[i].length > 4) {
        console.log(arr[i]);
    }
}
// 	display elements which start with 'a' or 'b'
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') || arr[i].startsWith('b')) {
        console.log(arr[i]);
    }
}
// 	display elements which end with 'e'
for (let i = 0; i < arr.length; i++) {
    if (arr[i].endsWith('e')) {
        console.log(arr[i]);
    }
}
// 	display elements which have 'an' as substring
for (let i = 0; i < arr.length; i++) {
    if (arr[i].includes('an')) {
        console.log(arr[i]);
    }
}
// 	concatenate all elements and display as a single string
let concatenatedString = arr.join('');
console.log(concatenatedString);        
// 	concatenate all elements with ',' separator and display as a single string
let concatenatedStringWithComma = arr.join(',');
console.log(concatenatedStringWithComma);
// 	replace 'a' with '@' in each element and display
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i].replace(/a/g, '@'));
}
// 	display elements which have length even
for (let i = 0; i < arr.length; i++) {
    if (arr[i].length % 2 === 0) {
        console.log(arr[i]);
    }
}
// 	display elements which have length odd
for (let i = 0; i < arr.length; i++) {
    if (arr[i].length % 2 !== 0) {
        console.log(arr[i]);
    }   
}
// 	display elements which have 'e' as second last character
for (let i = 0; i < arr.length; i++) {
    if (arr[i].length >= 2 && arr[i][arr[i].length - 2] === 'e') {
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character and length > 3
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') && arr[i].length > 3) {
        console.log(arr[i]);
    }
}
// 	display elements which have 'e' as last character and length < 5
for (let i = 0; i < arr.length; i++) {
    if (arr[i].endsWith('e') && arr[i].length < 5) {
        console.log(arr[i]);
    }
}
// 	display elements which have 'n' as second character and length > 3
for (let i = 0; i < arr.length; i++) {
    if (arr[i].length > 3 && arr[i][1] === 'n') {
        console.log(arr[i]);
    }
}
// 	display elements which have 'e' as first or last character
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('e') || arr[i].endsWith('e')) {
        console.log(arr[i]);
    }
}   
// 	display elements which have 'a' as first and 'e' as last character
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') && arr[i].endsWith('e')) {
        console.log(arr[i]);
    }   
}
// 	display elements which have 'n' as second character and 'e' as second last character
for (let i = 0; i < arr.length; i++) {
    if (arr[i].length >= 4 && arr[i][1] === 'n' && arr[i][arr[i].length - 2] === 'e') {
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character and 'e' as last character and length > 3
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') && arr[i].endsWith('e') && arr[i].length > 3) {
        console.log(arr[i]);
    }   
}
// 	display elements which have 'n' as second character or 'e' as second last character
for (let i = 0; i < arr.length; i++) {
    if (arr[i].length >= 2 && (arr[i][1] === 'n' || arr[i][arr[i].length - 2] === 'e')) {
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character or 'e' as last character and length > 3
for (let i = 0; i < arr.length; i++) {
    if ((arr[i].startsWith('a') || arr[i].endsWith('e')) && arr[i].length > 3) {
        console.log(arr[i]);
    }   
}
// 	display elements which have 'n' as second character and 'e' as second last character and length > 3
for (let i = 0; i < arr.length; i++) {
    if (arr[i].length > 3 && arr[i][1] === 'n' && arr[i][arr[i].length - 2] === 'e') {
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character or 'e' as last character or length > 3
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') || arr[i].endsWith('e') || arr[i].length > 3) {
        console.log(arr[i]);
    }   
}
// 	display elements which have 'n' as second character or 'e' as second last character or length > 3
for (let i = 0; i < arr.length; i++) {
    if ((arr[i].length > 3) || (arr[i].length >= 2 && (arr[i][1] === 'n' || arr[i][arr[i].length - 2] === 'e'))) {
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character and 'e' as last character or length > 3
for (let i = 0; i < arr.length; i++) {
    if ((arr[i].startsWith('a') && arr[i].endsWith('e')) || arr[i].length > 3) {
        console.log(arr[i]);
    }
}   
// 	display elements which have 'n' as second character and 'e' as second last character or length > 3
for (let i = 0; i < arr.length; i++) {
    if ((arr[i].length >= 4 && arr[i][1] === 'n' && arr[i][arr[i].length - 2] === 'e') || arr[i].length > 3) {
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character or 'e' as last character and length > 3 or 'n' as second character   
for (let i = 0; i < arr.length; i++) {
    if ((arr[i].startsWith('a') || arr[i].endsWith('e')) && arr[i].length > 3 || (arr[i].length >= 2 && arr[i][1] === 'n')) {
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character and 'e' as last character and length > 3 or 'n' as second character   
for (let i = 0; i < arr.length; i++) {
    if ((arr[i].startsWith('a') && arr[i].endsWith('e') && arr[i].length > 3) || (arr[i].length >= 2 && arr[i][1] === 'n')) {
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character or 'e' as last character or length > 3 or 'n' as second character   
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') || arr[i].endsWith('e') || arr[i].length > 3 || (arr[i].length >= 2 && arr[i][1] === 'n')) {
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character and 'e' as last character and length > 3 and 'n' as second character   
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') && arr[i].endsWith('e') && arr[i].length > 3 && (arr[i].length >= 2 && arr[i][1] === 'n')) {
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character or 'e' as last character and length > 3 or 'n' as second character or 'e' as second last character   
for (let i = 0; i < arr.length; i++) {
    if ((arr[i].startsWith('a') || arr[i].endsWith('e')) && arr[i].length > 3 || (arr[i].length >= 2 && (arr[i][1] === 'n' || arr[i][arr[i].length - 2] === 'e'))) {
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character and 'e' as last character and length > 3 or 'n' as second character or 'e' as second last character   
for (let i = 0; i < arr.length; i++) {
    if ((arr[i].startsWith('a') && arr[i].endsWith('e') && arr[i].length > 3) || (arr[i].length >= 2 && (arr[i][1] === 'n' || arr[i][arr[i].length - 2] === 'e'))) {
        console.log(arr[i]);
    }
}   
// 	display elements which have 'a' as first character or 'e' as last character or length > 3 or 'n' as second character or 'e' as second last character   
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') || arr[i].endsWith('e') || arr[i].length > 3 || (arr[i].length >= 2 && (arr[i][1] === 'n' || arr[i][arr[i].length - 2] === 'e'))) {
        console.log(arr[i]);
    }
}   
// 	display elements which have 'a' as first character and 'e' as last character and length > 3 and 'n' as second character and 'e' as second last character   
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') && arr[i].endsWith('e') && arr[i].length > 3 && (arr[i].length >= 2 && arr[i][1] === 'n') && (arr[i].length >= 2 && arr[i][arr[i].length - 2] === 'e')) {
        console.log(arr[i]);
    }
}   
// 	display elements which have 'a' as first character or 'e' as last character and length > 3 or 'n' as second character or 'e' as second last character or length even   
for (let i = 0; i < arr.length; i++) {
    if ((arr[i].startsWith('a') || arr[i].endsWith('e')) && arr[i].length > 3 || (arr[i].length >= 2 && (arr[i][1] === 'n' || arr[i][arr[i].length - 2] === 'e')) || arr[i].length % 2 === 0) {     
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character and 'e' as last character and length > 3 and 'n' as second character and 'e' as second last character and length even   
for (let i = 0; i < arr.length; i++) {
    if ((arr[i].startsWith('a') && arr[i].endsWith('e') && arr[i].length > 3 && (arr[i].length >= 2 && arr[i][1] === 'n') && (arr[i].length >= 2 && arr[i][arr[i].length - 2] === 'e')) && arr[i].length % 2 === 0) {
        console.log(arr[i]);
    }
}
// 	display elements which have 'a' as first character or 'e' as last character or length > 3 or 'n' as second character or 'e' as second last character or length even   
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') || arr[i].endsWith('e') || arr[i].length > 3 || (arr[i].length >= 2 && (arr[i][1] === 'n' || arr[i][arr[i].length - 2] === 'e')) || arr[i].length % 2 === 0) {
        console.log(arr[i]);
    }       
}
// 	display elements which have 'a' as first character and 'e' as last character and length > 3 and 'n' as second character and 'e' as second last character and length even   
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') && arr[i].endsWith('e') && arr[i].length > 3 && (arr[i].length >= 2 && arr[i][1] === 'n') && (arr[i].length >= 2 && arr[i][arr[i].length - 2] === 'e') && arr[i].length % 2 === 0) {
        console.log(arr[i]);
    }   
}
// 	display elements which have 'a' as first character or 'e' as last character and length > 3 or 'n' as second character or 'e' as second last character or length even or length odd
for (let i = 0; i < arr.length; i++) {
    if ((arr[i].startsWith('a') || arr[i].endsWith('e')) && arr[i].length > 3 || (arr[i].length >= 2 && (arr[i][1] === 'n' || arr[i][arr[i].length - 2] === 'e')) || arr[i].length % 2 === 0 || arr[i].length % 2 !== 0) {     
        console.log(arr[i]);
    }   
}
// 	display elements which have 'a' as first character and 'e' as last character and length > 3 and 'n' as second character and 'e' as second last character and length even and length odd   
for (let i = 0; i < arr.length; i++) {
    if ((arr[i].startsWith('a') && arr[i].endsWith('e') && arr[i].length > 3 && (arr[i].length >= 2 && arr[i][1] === 'n') && (arr[i].length >= 2 && arr[i][arr[i].length - 2] === 'e')) && arr[i].length % 2 === 0 && arr[i].length % 2 !== 0) {
        console.log(arr[i]);
    }
}   
// 	display elements which have 'a' as first character or 'e' as last character or length > 3 or 'n' as second character
// 	or 'e' as second last character or length even or length odd   
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') || arr[i].endsWith('e') || arr[i].length > 3 || (arr[i].length >= 2 && (arr[i][1] === 'n' || arr[i][arr[i].length - 2] === 'e')) || arr[i].length % 2 === 0 || arr[i].length % 2 !== 0) {
        console.log(arr[i]);
    }       
}
// 	display elements which have 'a' as first character and 'e' as last character and length > 3 and 'n' as second character
// 	and 'e' as second last character and length even and length odd   
for (let i = 0; i < arr.length; i++) {
    if (arr[i].startsWith('a') && arr[i].endsWith('e') && arr[i].length > 3 && (arr[i].length >= 2 && arr[i][1] === 'n') && (arr[i].length >= 2 && arr[i][arr[i].length - 2] === 'e') && arr[i].length % 2 === 0 && arr[i].length % 2 !== 0) {
        console.log(arr[i]);
    }   
}
// 	Note : Use prompt to take input from user for any element/substring/index etc. 
// 	Use switch case to provide user options to select any of the above operations to perform
// 	(Refer arrayLibrary.js for switch case implementation)