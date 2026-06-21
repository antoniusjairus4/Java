package Control_statement_and_Loops;
import java.util.Scanner;

public class Train_ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) {
            sc.close();
            return;
        }
        char type = sc.next().charAt(0);
        double distance = sc.nextDouble();

        if (distance < 0) {
            System.out.println("Invalid Distance");
            sc.close();
            return;
        }

        double ratePerKm = 0.5;
        double baseFare = distance * ratePerKm;
        double finalFare = 0;

        if (type == 'R') {
            finalFare = baseFare * (1 - 0.40);
            System.out.printf("Senior discount: 40%% Fare: Rs %.2f\n", finalFare);
        } else if (type == 'T') {
            finalFare = baseFare * (1 - 0.25);
            System.out.printf("Student discount: 25%% Fare: Rs %.2f\n", finalFare);
        } else if (type == 'G') {
            finalFare = baseFare;
            System.out.printf("General discount: 0%% Fare: Rs %.2f\n", finalFare);
        } else {
            System.out.println("Invalid Passenger Type");
        }

        sc.close();
    }
}