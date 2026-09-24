package Encapsulation;

import java.util.Scanner;

public class Day3 {
    static class Student{
        private String stdName;
        private int stdID;
        private byte stdAge;
        private String stdCourse;
        private int stdMarks;
        public Student(String stdName,int stdID,byte stdAge,String stdCourse,int stdMarks){
            this.stdName=stdName;
            this.stdID=stdID;
            this.stdAge=stdAge;
            this.stdCourse=stdCourse;
            this.stdMarks=stdMarks;
        }
        public  String  stdName(){
            return stdName;
        }
        public int stdID(){
            return stdID;
        }
        public byte stdAge(){
            return stdAge;
        }
        public String stdCourse(){
            return stdCourse;
        }
        public int stdMarks(){
            return stdMarks;
        }
    }
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
        String stdName=scan.nextLine();
        int stdID= scan.nextInt();
        scan.nextLine();
        byte stdAge=scan.nextByte();
        scan.nextLine();
        String stdCourse=scan.nextLine();
        int stdMarks= scan.nextInt();
       Student s1=new Student(stdName,stdID,stdAge,stdCourse,stdMarks);
       System.out.println(s1.stdID());
       System.out.println(s1.stdName());
       System.out.println(s1.stdAge());
       System.out.println(s1.stdCourse());
       System.out.println(s1.stdMarks());
    }
}
