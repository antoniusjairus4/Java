package Basic_Problems;

import java.util.Scanner;

public class Profit{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double cost_price = s.nextDouble();
        double selling_price = s.nextDouble();

        double profit = selling_price - cost_price;

        System.out.printf("%.1f", profit);

        s.close();
    }
}
