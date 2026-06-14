package Basic_Problems;

import java.util.Scanner;

class Kinetic_Energy_Calculator{
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        double m = s.nextDouble();
        double v = s.nextDouble();

        double result = 0.5 * m * (v * v);

        System.out.printf("Kinetic Energy: %.2f J", result);

        s.close();
    }
}