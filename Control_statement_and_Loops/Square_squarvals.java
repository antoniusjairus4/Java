package Control_statement_and_Loops;
import java.util.Scanner;

public class Square_squarvals
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n < 1){
            System.out.print("Invalid input");
            return;
        }
        
        int midpoint = (n + 1) / 2;
        
        for (int i = 1; i <= n; i++) {
            int currentMultiplier;
            if (i <= midpoint) {
                currentMultiplier = i;
            } else {
                currentMultiplier = n - i + 1;
            }
            
            int printValue = currentMultiplier * currentMultiplier;
            
            for (int j = 1; j <= n; j++) {
                System.out.print(printValue + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}