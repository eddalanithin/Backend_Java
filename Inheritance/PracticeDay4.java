package com.OOPS;

public class PracticeDay4 {
    public  static  void main(String[] ars){
        GetEmp res=new GetEmp();
        Employee man=new Manager();
        Employee eng=new Engineer();
        System.out.println("------------MANAGER DETAILS--------------");

        res.printOutput(man);
        System.out.println("------------ENGINEER DETAILS--------------");
        res.printOutput(eng);
        System.out.println("------------MANAGER special methods--------------");

        Manager manager=(Manager) man;
        manager.managerSalary();
        System.out.println("------------ENGINEER special methods--------------");
        Engineer engineer=(Engineer) eng;
        engineer.engineerSalary();

    }
}
class GetEmp{
    void printOutput(Employee res){
        System.out.println(res.getEmpId());
        System.out.println(res.getEmpName());
        System.out.println(res.getEmpDepartment());
    }
}
class Employee{
    int empId;
    String empName;
    String empDepartment;
    long empSalary;
    {
        this.empSalary=3900467l;
    }


    void work(){
        System.out.println("Employee work on their respective department");
    }
    public  Employee(){
        this.empId=709;
        this.empName="Nithin";
        this.empDepartment ="IT";
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }
}
class Manager extends Employee{
    long empSalary;
    {
        this.empSalary=480724909l;
        System.out.println("EMPLOYEE LEVEl  :"+(super.empSalary));
        System.out.println("MANAGER LEVEl  :"+(this.empSalary));
    }
    public Manager(){
        super();
        this.empId=111;
        this.empName="Suri";
        this.empDepartment ="SI";
    }
    @Override
    void work() {
        System.out.print("Manager assign the work to Engineers");
    }
    void managerSalary(){
        System.out.println("More salary compare to Engineer");
    }

}
class Engineer extends Employee{
    long empSalary;
    {
        this.empSalary=1200938l;
        System.out.println("EMPLOYEE LEVEl  :"+(super.empSalary));
        System.out.println("Engineer LEVEl  :"+(this.empSalary));
    }
    public Engineer(){
        super();
        this.empId=333;
        this.empName="Martin";
        this.empDepartment ="DRDO";

    }

    @Override
    void work() {
        System.out.print("Engineer to their repective works");
    }
    void engineerSalary(){
        System.out.println("less salary compare to Manager");
    }

}
