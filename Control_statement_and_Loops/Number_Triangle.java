package Control_statement_and_Loops;

import java.util.Scanner;

class Number_Triangle{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if(n < 2){
            System.out.print("Invalid input");
            // return;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.printf("\n");
        }

        s.close();
    }
}