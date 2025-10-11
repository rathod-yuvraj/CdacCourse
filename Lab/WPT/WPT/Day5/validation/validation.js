// Perform the form validations as shown the different method
//   for name and age 
//    and display error message if it not valid 
function validateForm() {
    const name = document.getElementById("name").value;
    const age = document.getElementById("age").value;
    let valid = true;
    let errorMessage = "";
    if (name.length < 3) {
        valid = false;
        errorMessage += "Name must be at least 3 characters long.\n";
    }
    if (isNaN(age) || age < 1 || age > 120) {
        valid = false;
        errorMessage += "Age must be a number between 1 and 120.\n";
    }
    if (!valid) {
        alert(errorMessage);
    }
    return valid;
}
document.getElementById("myForm").onsubmit = validateForm;
// Perform the form validations as shown the different method
//   for name and age 
//    and display error message if it not valid  --- IGNORE ---
    // validations in javascript different way validate age and name
//     if not valid display error message
//     if valid allow to submit form
//     use alert to display error message
//     use onsubmit event of form to call validation function
//     use return false to prevent form submission if not valid
//     use return true to allow form submission if valid
//     use document.getElementById to get form elements
//     use value property to get value of form elements
//     use length property to check length of name
//     use isNaN() function to check if age is a number
//     use alert() function to display error message
//     use \n to display error message in new line
//     use && and || operators to combine conditions
//     use if statement to check conditions
//     use let keyword to declare variables
//     use const keyword to declare constants
//     use function keyword to declare function
//     use return statement to return value from function
//     use document.getElementById("myForm").onsubmit to set onsubmit event handler
//     use validateForm function as event handler
//     use valid variable to track if form is valid or not
//     use errorMessage variable to store error message
//     use += operator to append error message