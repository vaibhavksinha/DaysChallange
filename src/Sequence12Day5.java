/*Write a  program to produce following design
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
If user enters n value as 5*/
import java.util.Scanner;
public class Sequence12Day5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter a number -");
        int n= sc.nextInt();
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++) {
                System.out.print(" " + j + "\t");
            }
            System.out.print("\n");
        }


    }
}
