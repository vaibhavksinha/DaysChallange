
public class SequenceDay7 {
    public static void main(String[] args) {
        int i,j,l;
        for (i=1;i<=4;i++) {
            for (j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for (l=1;l<=i;l++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
