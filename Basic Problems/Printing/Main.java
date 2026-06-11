package Printing;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the customer Name : ");
        String customer_name = sc.nextLine();

        System.out.print("Enter the movie name : ");
        String movie = sc.nextLine();

        System.out.print("Enter the number of tickets : ");
        int tickets = sc.nextInt();

        System.out.print("Enter the price of a ticket : ");
        double price = sc.nextDouble();

        System.out.print("Enter your seat type : ");
        char seat_type = sc.next().charAt(0);

        System.out.println(customer_name);
        System.out.println(movie);
        System.out.println(tickets);
        System.out.println(price);
        System.out.println(seat_type);

        sc.close();
    }
}