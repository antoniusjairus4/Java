package Control_statement_and_Loops;
import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lightCount = 0;
        int standardCount = 0;
        int heavyCount = 0;

        while (true) {
            double weight = sc.nextDouble();
            
            if (weight == 0) {
                break;
            }

            if (weight < 1.0) {
                System.out.print("Light ");
                lightCount++;
            } else if (weight <= 5.0) {
                System.out.print("Standard ");
                standardCount++;
            } else {
                System.out.print("Heavy ");
                heavyCount++;
            }
        }
        
        System.out.println("Light: " + lightCount + " Standard: " + standardCount + " Heavy: " + heavyCount);
        
        sc.close();
    }
}