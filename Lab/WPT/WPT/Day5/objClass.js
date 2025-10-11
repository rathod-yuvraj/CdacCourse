// go through object and class syntax in javascript 

class Employee{
    // properties
    empId;
    empName;
    empSalary;
    empDept;
    // constructor
    constructor(id, name, salary, dept){
        this.empId = id;
        this.empName = name;
        this.empSalary = salary;
        this.empDept = dept;
    }       
    // method
    display(){
        console.log(`Employee Id : ${this.empId}`);
        console.log(`Employee Name : ${this.empName}`);
        console.log(`Employee Salary : ${this.empSalary}`);
        console.log(`Employee Dept : ${this.empDept}`);
    }
}

let emp1 = new Employee(101, "Yuvraj", 45000, "IT");
let emp2 = new Employee(102, "Rahul", 55000, "HR"); 
emp1.display();
emp2.display();
console.log(emp1);
console.log(emp2);
console.log(typeof(emp1));
console.log(typeof(emp2));
console.log(emp1 instanceof Employee);
console.log(emp2 instanceof Employee);
console.log(emp1.empName);
console.log(emp2.empDept);
emp1.empSalary = 50000;
emp1.display();
emp2.empDept = "Finance";
emp2.display(); 
// emp1.display();