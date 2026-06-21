package Control_statement_and_Loops;

import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        if(n <= 100){
            System.out.print(n * 1.5);
        }

        else if(n > 100 && n <= 200){
            System.out.print(150 + (n - 100) * 2.5);
        } 

        else if(n > 200 && n <= 500){
            System.out.print(150 + 250 + (n - 200) * 4);
        }

        else if(n > 500){
            System.out.print(150 + 250 + 800 + (n - 200));
        }

        s.close();
    }
}
