/*
program to print the even numbers up to n
 */

import java.util.Scanner;
public class EvenDay3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i;
        System.out.println("Enter a number -");
        int n=sc.nextInt();
        System.out.println("First "+n+" even numbers are");
        for (i=0;i<=n;i+=2)
            System.out.println("\n "+i+" \t");
    }
}
