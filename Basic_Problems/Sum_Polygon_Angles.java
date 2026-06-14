package Basic_Problems;

import java.util.Scanner;

class Sum_Polygon_Angles{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        int result = (input - 2) * 180;
        System.out.print(result);

        s.close();
    }
}