package com.Task6;

public class Addamount {
    double amount=50;

    public Addamount() {
        amount=50;
    }

    public Addamount(double a) {
        amount=amount+50;
    }

    public static void main(String[] args) {
        Addamount a1 = new Addamount();
        Addamount a2 = new Addamount(40);
        System.out.println(a1.amount);
        System.out.println(a2.amount);

    }
}
