package com.OOPS;

public class PracticeTricky {
    public static  void main(String[] args){
    Employee1 man=new Managerr();
    GetDetails gd=new GetDetails();
    gd.printDetails(man);
    Managerr managerr=(Managerr) man;
    System.out.println("----SPECIAL METHOD OF CHILD OF PARENT TYPE REFERENCE-----");
    managerr.specialWork();
    System.out.println("----Salary-----");
    ((Managerr) man).classSalary();



    }
}
class GetDetails{
    void printDetails(Employee1 res){
        res.workk();
        res.display();
    }
}
class Employee1{
    String empNamee;
    long empSalaryy;
    public Employee1(){
        System.out.println("------PARENT CLASS EXECUTION------");
        this.empNamee="Abhi";
        this.empSalaryy=789789l;
    }
    void workk(){
        System.out.println("Employee is working");
    }

    public long getEmpSalaryy() {
        return empSalaryy;
    }

    public String getEmpNamee() {
        return empNamee;
    }

    void display(){
        System.out.println(getEmpNamee());
        System.out.println(getEmpSalaryy());
    }
}
class Managerr extends Employee1{
    long managerSalaryy;
    public Managerr(){
        super();
        System.out.println("------CHILD CLASS EXECUTION------");
        this.managerSalaryy=9876554l;
    }

    @Override
    void workk() {
        System.out.println("Manager is Working");
    }
    void specialWork(){
        System.out.println("Special work");
    }
    @Override
    void display(){
        System.out.println("--Child details---");
        System.out.println(super.getEmpNamee());
        System.out.println(this.managerSalaryy);
    }
    void classSalary(){
        System.out.println("-----PARENT salary----");
        System.out.println(super.empSalaryy);
        System.out.println("-----Child salary or currently obt reference salary----");
        System.out.println(this.managerSalaryy);
    }
}