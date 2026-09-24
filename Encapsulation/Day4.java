package Encapsulation;

import java.util.Scanner;

public class Day4 {
    public static class  Student{
        private int stdID;
        private String stdName;
        private String course;

        public int getStdID() {
            return stdID;
        }

        public String getStdName() {
            return stdName;
        }

        public String getCourse() {
            return course;
        }

        public void setStudent(int stdID,String stdName,String course) {
            this.course = course;
            this.stdName = stdName;
            this.stdID = stdID;
        }
    }
    public  static  void main(String[] args){
       Scanner scan=new Scanner(System.in);
       Student s1=new Student();
       int numberOfStudents=scan.nextInt();
       
    }
}
