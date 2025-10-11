function getFactorialImpl(choice = "FORLOOP") {
    function Fact1(n) { // using for loop
        let fact = 1;
        for (let i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    function Fact2(n) { // using recursion
        if (n === 0 || n === 1) return 1;
        return n * Fact2(n - 1);
    }

    if (choice === "FORLOOP") return Fact1;
    else if (choice === "RECUR") return Fact2;
}

// Test
let rv = getFactorialImpl("RECUR");
console.log("Factorial (RECUR) of 3:", rv(3));

rv = getFactorialImpl();
console.log("Factorial (FORLOOP) of 5:", rv(5));
