package Basic_Problems;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        double num_1 = s.nextDouble();
        double num_2 = s.nextDouble();

        System.out.println(num_1 / num_2);

        s.close();
    }
}