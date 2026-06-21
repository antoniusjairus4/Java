package Control_statement_and_Loops;
import java.util.Scanner;

public class Toll_eval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char vehicleType = sc.next().charAt(0);

        if (vehicleType == 'B') {
            System.out.println("Bike - Rs 20");
        } else if (vehicleType == 'C') {
            System.out.println("Car - Rs 60");
        } else if (vehicleType == 'T') {
            System.out.println("Truck - Rs 150");
        } else if (vehicleType == 'E') {
            System.out.println("Emergency - Free");
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}