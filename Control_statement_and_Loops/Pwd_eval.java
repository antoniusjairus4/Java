package Control_statement_and_Loops;
import java.util.Scanner;

public class Pwd_eval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();

        if (password < 100000 || password > 999999) {
            System.out.println("Weak Password");
        }

        int temp = password;
        int evenCount = 0;
        boolean allSame = true;
        int firstExtractedDigit = temp % 10;

        while (temp > 0) {
            int digit = temp % 10;
            
            if (digit % 2 == 0) {
                evenCount++;
            }
            
            if (digit != firstExtractedDigit) {
                allSame = false;
            }
            
            temp = temp / 10;
        }

        if (evenCount >= 2 && !allSame) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
        
        sc.close();
    }
}
