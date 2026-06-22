package Control_statement_and_Loops;

import java.util.Scanner;

class Right_Triangle{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1; i < n; i++){
            for(int j = 1; j <= n - 1; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        s.close();
    }
}