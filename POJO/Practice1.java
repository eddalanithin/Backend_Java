package POJO;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int objectCount = scan.nextInt();
        Student[] stdAr = new Student[objectCount];
        scan.nextLine();
        System.out.println("Enter the Students Details !!!!");
        for (int i = 0; i < stdAr.length; i++) {
            stdAr[i] = new Student();
            String data=scan.nextLine();
            String[] stdData=data.split(",");
            stdAr[i].setStdId(Integer.parseInt(stdData[0]));
            stdAr[i].setStdName(stdData[1]);
            stdAr[i].setStdAge(Integer.parseInt(stdData[2]));
            stdAr[i].setStdCourse(stdData[3]);
        }
        System.out.println("Student Details !!!!");
        for(int i=0;i< stdAr.length;i++) {
            System.out.println("Student " +(i+1)+" and His id :"+stdAr[i].getStdId());
            System.out.println("Student " +(i+1)+" and His Name :"+stdAr[i].getStdName());
            System.out.println("Student " +(i+1)+" and His Age :"+stdAr[i].getStdAge());
            System.out.println("Student " +(i+1)+" and His Coures :"+stdAr[i].getStdCourse());

        }
    }
}

 class Student{
    private int stdId;
    private String stdName;
    private int stdAge;
    private String stdCourse;
    // Zero Parameterized constructor
    public  Student(){

    }
    // Parameterized constructor;
    public Student(int stdId,String stdName,int stdAge,String stdCourse){
        this.stdId=stdId;
        this.stdName=stdName;
        this.stdAge=stdAge;
        this.stdCourse=stdCourse;
    }

    // setter Methods
    public void setStdId(int stdId) {
        this.stdId = stdId;
    }
    public void setStdName(String stdName) {
        this.stdName = stdName;
    }
    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }
    public void setStdCourse(String stdCourse) {
        this.stdCourse = stdCourse;
    }

    // Getter Methods

    public int getStdId() {
        return stdId;
    }
    public String getStdName() {
        return stdName;
    }
    public int getStdAge() {
        return stdAge;
    }
    public String getStdCourse() {
        return stdCourse;
    }
}
