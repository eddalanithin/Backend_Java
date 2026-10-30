package com.OOPS;

import java.util.Scanner;

public class PracticeDay1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Shape s ;
        s=new Square();
        //Square
        s.acceptInput(scanner);
        s.caclArea();
        s.displayArea();
        //Rectangle
        s=new Rectangle();
        s.acceptInput(scanner);
        s.caclArea();
        s.displayArea();
        // circle
        s=new Circle();
        s.acceptInput(scanner);
        s.caclArea();
        s.displayArea();
        
    }
}
abstract class Shape{
    private double area;
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    abstract void acceptInput(Scanner scanner);
    abstract void caclArea();
    void displayArea(){

    }
}
class Square extends Shape{
    private double side;
    public double getSide() {
        return side;
    }
    public void setSide(double  side) {
        this.side = side;
    }
    @Override
    void acceptInput(Scanner scanner) {
        System.out.println("Enter the side of Square");
        setSide(scanner.nextInt());
    }
    @Override
    void caclArea() {
        setArea(getSide()*getSide());
    }
    @Override
    void displayArea() {
      System.out.println("Area of Square: "+ getArea());
    }
}
class Rectangle extends Shape{
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double height) {
        this.breadth = height;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    void acceptInput(Scanner scanner) {
        System.out.println("enter the length of Rectangle: ");
        setLength(scanner.nextDouble());
        System.out.println("enter the Breadth of Rectangle: ");
        setBreadth(scanner.nextDouble());
    }
    @Override
    void caclArea() {
        setArea(getLength()*getBreadth());
    }
    @Override
    void displayArea() {
        System.out.println("Area of Rectangle: "+getArea());
    }
}
class  Circle extends Shape{
    private  double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void acceptInput(Scanner scanner) {
        System.out.println("Enter the radius: ");
        setRadius(scanner.nextDouble());
    }
    @Override
    void caclArea() {
        setArea(Math.PI*radius*radius);
    }
    @Override
    void displayArea() {
        System.out.printf("Area of circle: %.2f",getArea());
    }
}