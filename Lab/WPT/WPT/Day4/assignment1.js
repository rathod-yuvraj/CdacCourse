// Write a function getFactorialImpl ( choice="FORLOOP" ) ----it could be FORLOOP or RECUR
// 	Function Fact2(n1)
// 	Use recursion and print the factorial
// 	If the choice is FORLOOP return Fact1
// 	If the choice is RECUR then return Fact2
// 	Outside --- call let rv = getFactorialImpl("RECUR")
// 	rv(3)
// 	Rv = getFactorialImpl()
// 	rv(5)
function getFactorialImpl(choice = "FORLOOP") {
    function Fact1(n) {
        let fact = 1;
        for (let i = 1; i <= n; i++) {
            fact = fact * i;
        }
        console.log(fact);
    }
    function Fact2(n1) {
        if (n1 === 0 || n1 === 1) {
            return 1;
        } else {
            return n1 * Fact2(n1 - 1);
        }
    }
    if (choice === "FORLOOP") {
        return Fact1;
    } else if (choice === "RECUR") {
        return Fact2;
    }
}

let rv = getFactorialImpl("RECUR");
console.log(rv(3));
rv = getFactorialImpl();
rv(5);
// Write a function to add 3 numbers and print the values
 function addThreeNumbers(a, b, c) {
    let sum = a + b + c;
    console.log("Sum of three numbers: " + sum);
}
addThreeNumbers(5, 10, 15);

// write a function to add 2 numbers and return the value

