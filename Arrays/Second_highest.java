package Arrays;

import java.util.Scanner;

public class Second_highest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n < 2) {
            System.out.print("Invalid input");
            // return;
        }

        int[] sales = new int[n];

        for (int i = 0; i < n; i++) {
            sales[i] = s.nextInt();
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (sales[i] > highest) {
                secondHighest = highest;
                highest = sales[i];
            } else if (sales[i] > secondHighest && sales[i] != highest) {
                secondHighest = sales[i];
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second highest sales value.");
        } else {
            System.out.println("Second highest sales: " + secondHighest);
        }

        s.close();
    }
}
