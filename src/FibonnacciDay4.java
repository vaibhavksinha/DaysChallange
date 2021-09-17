import java.util.Scanner;
public class FibonnacciDay4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,s,c;
        System.out.println("Enter a number -");
        int n = sc.nextInt();
        for(c=1;c<=n;c++) {
            s = b + a;
            System.out.println("\n " +s);
            a = b;
            b = s;
        }
    }
}
