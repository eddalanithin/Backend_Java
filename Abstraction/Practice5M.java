package com.Abstraction;

public class Practice5M {
//    Create an abstract class named EmployeeRole.
//    Add a constructor that accepts an employee name and stores it in a field.
//    Declare an abstract method calculateSalary() returning double.
//    Add a concrete method displayName() that prints the stored employee name.
//    Create a concrete class named ContractEmployee that extends EmployeeRole.
//    Implement calculateSalary() to return a salary value.
//    In main(), create a ContractEmployee object, call both methods, and print the salary.
//    Explain how the constructor of the abstract class receives the
//      employee name when a subclass object is created.
    public static void main(String[] args) {
        ContractEmployee contractEmployee=new ContractEmployee("Nithin");
        contractEmployee.displayName();
        System.out.print(contractEmployee.calculateSalary());
    }
}
abstract class EmployeeRole{
    String empName;
    public EmployeeRole(String empName){
        this.empName=empName;
    }
    abstract double calculateSalary();
    void displayName(){
        System.out.println(empName);
    }
}
class ContractEmployee extends EmployeeRole{
    public ContractEmployee(String empName) {
        super(empName);
    }

    @Override
    double calculateSalary() {
        return 5000;
    }
}