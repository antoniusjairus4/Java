package Control_statement_and_Loops;
import java.util.Scanner;

public class Mul_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1 || n > 20) {
            System.out.println("Invalid");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.print(n + " x " + i + " = " + (n * i));
                if (i < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}