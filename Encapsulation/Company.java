package Encapsulation;

import java.util.Scanner;

public class Company {
    //HR Employee Management Software
    public static class Employee{
        private int empID;
        private String empName;
        private double empSalary;
        public void setEmployee(int empID,String empName,double empSalary){
            this.empID =empID;
            this.empName=empName;
            this.empSalary=empSalary;
        }

        public double getEmpSalary() {
            return empSalary;
        }

        public int getEmpID() {
            return empID;
        }

        public String getEmpName() {
            return empName;
        }
    }
    public static  void main(String[] args){
       Scanner scan=new Scanner(System.in);
       Employee emp1=new Employee();
       emp1.empID= scan.nextInt();
       scan.nextLine();
       emp1.empName= scan.nextLine();
       emp1.empSalary= scan.nextDouble();
       System.out.println("Employee ID: "+emp1.getEmpID());
       System.out.println("Employee Name: "+emp1.getEmpName());
       System.out.println("Employee Salary: "+emp1.getEmpSalary());
    }

}
