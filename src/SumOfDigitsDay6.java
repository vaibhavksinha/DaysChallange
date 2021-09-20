import java.util.Scanner;
public class SumOfDigitsDay6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d,s=0;
        System.out.println("Enter a number -");
        int n = sc.nextInt();

        while(n>0){
            d=n%10;
            s=s+d;
            n=n/10;
        }
        System.out.println("Sum of digits ="+s);

    }


}
