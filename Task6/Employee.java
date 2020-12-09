package com.Task6;

import java.util.Scanner;

public class Employee {
    String name;
    int year;
    String address;
    public void inputdata(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Name:");
        name = input.nextLine();
        System.out.print("Enter Employee year of joining:");
        year = input.nextInt();
        System.out.print("Enter Employee Address:");
        address = input.next();
    }


    public static void main(String[] args) {
        Employee e[] = new Employee[3];

        for(int i=0; i<3; i++) {

            e[i] = new Employee();
            e[i].inputdata();
        }
        System.out.println("name       Year of Joining       Address");
        for(int i=0; i<3; i++) {
            System.out.println(e[i].name+"        "+e[i].year+"             "+e[i].address);
        }
    }

}
