// Accept 2 numbers from command line and perform multiplication using Promise

let a = Number(process.argv[2]);
let b = Number(process.argv[3]);

let myPromise = new Promise((resolve, reject) => {
    // Check if both numbers are positive
    if (a > 0 && b > 0) {
        resolve(a * b); // success
    } else {
        reject("Error: Both numbers must be positive!");
    }
});

myPromise.then(
    (result) => {
        console.log("Multiplication: " + result);
    },
    (error) => {
        console.log(error);
    }
);
