package Control_statement_and_Loops;

import java.util.Scanner;

public class Gym_membership {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if(n == 1){
            System.out.print("Add workout session");
        }

        else if(n == 2){
            System.out.print("View session");
        }

        else if(n == 3){
            System.err.print("Exit");
        }
        s.close();
    }
}
