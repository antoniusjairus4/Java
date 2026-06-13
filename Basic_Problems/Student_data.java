package Basic_Problems;
import java.util.Scanner;

public class Student_data {
    
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);

        System.out.printf("Enter your name : ");
        String name = s.nextLine();

        System.out.printf("\n ENter your Reg No : ");
        int reg = s.nextInt();

        System.out.printf("\n Enter your SGPA of 2nd Sem");
        int sgpa = s.nextInt();

        System.out.println("Name : " + name);
        System.out.println("Reg NO : " + reg);
        System.out.println("SGPA : " + sgpa);

        s.close();
    }
}
