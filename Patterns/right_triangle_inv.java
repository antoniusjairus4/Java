package Patterns;
import java.util.Scanner;

public class right_triangle_inv {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        s.close();
    }
}
