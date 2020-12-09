package com.Task6;

public class Rectangle {
    float length;
    float breadth;
    float area;

    public Rectangle() {
        length=breadth=0;
    }

    public Rectangle(float length) {
        this.length = length;
        breadth=length;
    }

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        area = length*breadth;
        System.out.println("Area of rectangle is "+area);
    }

    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        Rectangle r2 =new Rectangle(10);
        Rectangle r3=new Rectangle(10,20);

        r1.area();
        r2.area();
        r3.area();



    }
}
