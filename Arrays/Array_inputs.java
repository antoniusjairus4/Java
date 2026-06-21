package Arrays;

import java.util.Scanner;

class Array_inputs {
    public static void main(String[] args) {
        
        // Wrapping Scanner here means Java automatically handles s.close() for you
        try (Scanner s = new Scanner(System.in)) {
            
            int n = s.nextInt();
            if (n < 0) {
                System.out.print("Invalid input");
                return; // Safely exits here, Java closes the scanner automatically!
            }

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                if (arr[i] < 0) {
                    System.out.print("Invalid input");
                    return; // Safely exits here too, scanner is automatically closed!
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            
        } // The scanner resource scope ends completely here
    }
}