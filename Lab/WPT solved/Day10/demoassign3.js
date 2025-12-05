function display() {
    // Accept input from command line
    let num = Number(process.argv[2]);

    // Check if input is valid
    if (num < 1 || num > 5 || isNaN(num)) {
        console.log("Error: Please enter a number between 1 and 5.");
        return;
    }

    // Display pattern
    for (let i = num; i >= 1; i--) {
        let row = "";
        for (let j = 1; j <= i; j++) {
            row += "* ";
        }
        console.log(row.trim());
    }
}

display();
