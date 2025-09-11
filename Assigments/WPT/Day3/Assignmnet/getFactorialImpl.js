function Fact1() {
    let userName = prompt("Please enter your name:");
    document.getElementsByClassName("get")[0].innerHTML = userName;

    let n1 = parseInt(prompt("Please enter a number to calculate the factorial:"));
    let factorial = 1;

    for (let i = 1; i <= n1; i++) {
        factorial *= i;
    }

    console.log(`Factorial of ${n1} is ${factorial}`);
    document.getElementsById("demo").innerHTML = factorial;
  
    
};

Fact1();
function ouput(){
  document.getElementsById("demo").innerTEXT = n1;
}
