package Patterns;
import java.util.Scanner;

public class lower_triangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        for(int i = n; i >= 1; i--){
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }

            for(int k = 0; k < (2 * i - 1); k++){
                System.out.print("*");
            }

            System.out.println();
        }

        s.close();
    }
}
