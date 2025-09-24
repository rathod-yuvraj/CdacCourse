function displaynum() {
    for (let i = 1; i <= 100; i++) {
        if (i % 3 === 0 && i % 5 === 0) {
            console.log("divisible by both 3 and 5: " + i + " FootBall");
        } else if (i % 3 === 0) {
            console.log("divisible by 3: " + i + " Foot");
        } else if (i % 5 === 0) {
            console.log("divisible by 5: " + i + " Ball");
        } else {
            console.log("Number: " + i);
        }
    }
}

displaynum();
