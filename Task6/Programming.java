package com.Task6;

import java.util.Scanner;

public class Programming {
    String msg;

    public Programming() {
        msg="Programming Languages";
    }

    public Programming(String msg) {
        this.msg = msg;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Programming p1 = new Programming();
        System.out.println("I love "+p1.msg);

        System.out.print("Enter any language:");
        String s= input.nextLine();
        Programming p2 = new Programming(s);
        System.out.println("I love "+p2.msg);


    }
}
