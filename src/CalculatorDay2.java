//Calculator

import java.util.Scanner;
public class CalculatorDay2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number- ");
        double a = sc.nextInt();
        System.out.print("Enter the second number- ");
         double b = sc.nextInt();
        System.out.print("which opration do you want to perform 1-Add ,2-subtract ,3-multiply ,4-divide -");
        int c = sc.nextInt();

        switch (c){
            case 1:
                System.out.println("Addition = "+(a+b));
                break;
            case 2:
                System.out.println("Subtration = "+(a-b));
                break;
            case 3:
                System.out.println("multiply = "+(a*b));
                break;
            case 4:
                System.out.println("Divide = "+(a/b));
                break;
            default:
                System.out.println("Please enter valid input");
        }


    }
}