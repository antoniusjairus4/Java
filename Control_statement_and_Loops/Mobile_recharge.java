package Control_statement_and_Loops;

import java.util.Scanner;

public class Mobile_recharge {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if(n == 1){
            System.out.print("Talktime Rs 49");
        }

        else if(n == 2){
            System.out.print("Data 1GB Rs 99");
        }

        else if(n == 3){
            System.err.print("Combo Rs149");
        }

        else if(n == 4){
            System.err.print("International Rs 499");
        }

        else{
            System.err.print("Invalid operation");
        }
        
        s.close();
    }
}
