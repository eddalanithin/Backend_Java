package POJO;
import java.util.*;

public class Practice3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int objectCount=sc.nextInt();
        sc.nextLine();
        Employee[] empAr=new Employee[objectCount];
        System.out.println("Enter the Employee Details !!!!");
        for(int i=0;i< empAr.length;i++){
            empAr[i]=new Employee();
            String data=sc.nextLine();
            String[] empData=data.split(" ");
            empAr[i].setEmpId(Integer.parseInt(empData[0]));
            empAr[i].setEmpName(empData[1]);
            empAr[i].setEmpSalary(Double.parseDouble(empData[2]));
            empAr[i].setEmpDepartment(empData[3]);
        }
        System.out.println("Employee Details !!!!");
        for(int i=0;i<empAr.length;i++){
            System.out.println((i+1)+"st Employee Id: "+empAr[i].getEmpId());
            System.out.println((i+1)+"st Employee Name: "+empAr[i].getEmpName());
            System.out.println((i+1)+"st Employee Salary: "+empAr[i].getEmpSalary());
            System.out.println((i+1)+"st Employee Department: "+empAr[i].getEmpDepartment());
        }
    }
}
class Employee{
    private int empId;
    private String empName;
    private double empSalary;
    private String empDepartment;
// Zero Parameterized Constructor
    public Employee() {

    }
    //  Parameterized Constructor
    public Employee(int empId,String empName,double empSalary,String empDepartment) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDepartment = empDepartment;

    }
// Setter

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    // Getter
    public int getEmpId() {
        return empId;
    }
    public String getEmpName() {
        return empName;
    }
    public double getEmpSalary() {
        return empSalary;
    }
    public String getEmpDepartment() {
        return empDepartment;
    }

}
