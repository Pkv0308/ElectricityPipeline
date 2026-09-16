package com.Billing.org;

import java.util.Scanner;

public class App {
    public static double calculateBill(int units){
        if(units<0){
            throw new IllegalArgumentException("Units cannot be negative.");
        }
        double bill=0;
        if(units<100) {System.out.println("Free!!");}
        else if(units<250){ bill=2.5*units;}
        else if(units<500){ bill=5*units;}
        else if(units<1000){ bill=12*units;}
        else {bill=15*units;}
        return bill;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of units consumed: ");
        int units = scanner.nextInt();
        try{
            double bill = calculateBill(units);
            System.out.println("Units Consumed: "+units);
            System.out.printf("Total Bill: Rs. %.2f%n",bill);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
       scanner.close();
    }
}
