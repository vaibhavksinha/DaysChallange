//Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5,
//and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges).
//For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance after an attempted transaction.
package com.company;

import java.util.Scanner;

public class ATm {

    public static void main(String[] args) {
        double i=50000;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the withdrawal amount- ");
        int w= sc.nextInt();
        if(w>i) System.out.println("insufficient balance");
        else {
            i=i-(w+0.50);
            System.out.println("Remaining balance= "+i);
        }
    }
}
