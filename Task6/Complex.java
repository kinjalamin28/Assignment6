package com.Task6;

import java.util.Scanner;

public class Complex {
    double real;
    double imaginary;

    public void complexnumsum(double r1,double i1,double r2,double i2){
        real = r1+r2;
        imaginary = i1+i2;

        System.out.println("Sum of two complex num is : "+real+ " + "+imaginary+"i");
    }
    public void complexnumdiff(double r1,double i1,double r2,double i2){
        real = r1-r2;
        imaginary = i1-i2;

        System.out.println("Difference of two complex num is : "+real+ " + "+imaginary+"i");
    }
    public void complexnumproduct(double r1,double i1,double r2,double i2){
        real = r1*r2;
        imaginary = (r1*i2)+(i1*r2);
        double isquare = i1*i2;

        System.out.println("Product of two complex num is : "+real+ " + "+imaginary+"i + "+isquare+"i2");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter real & imaginary part of complex num1:");
        Double real1 = input.nextDouble();
        Double imaginary1 = input.nextDouble();
        System.out.println("Enter real & imaginary part of complex num2:");
        Double real2 = input.nextDouble();
        Double imaginary2 = input.nextDouble();
        System.out.println("Complex Num1: "+real1+ " + "+imaginary1+"i");
        System.out.println("Complex Num1: "+real2+ " + "+imaginary2+"i");

        Complex c = new Complex();
        c.complexnumsum(real1,imaginary1,real2,imaginary2);
        c.complexnumdiff(real1,imaginary1,real2,imaginary2);
        c.complexnumproduct(real1,imaginary1,real2,imaginary2);


    }
}
