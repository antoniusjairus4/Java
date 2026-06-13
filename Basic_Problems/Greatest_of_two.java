package Basic_Problems;

import java.util.Scanner;

class Greatest_of_two{

    public static void main(String[] args){

        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if(a > b){
            System.out.print(a);
        }
        else{
            System.out.print(b);
        }

        s.close();
    }
}