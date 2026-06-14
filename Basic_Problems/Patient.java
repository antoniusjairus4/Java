package Basic_Problems;

import java.util.Scanner;

class Patient {
    String name;
    int age;
    char gender;
    boolean insurance;
    double fee;

    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(insurance);
        System.out.println(fee);
    }
}

class Printing_OOP{
    public static void main(String[] args){ // correction : 1
        Scanner s = new Scanner (System.in);
        Patient p = new Patient();

        System.out.print("Enter the name of the patient : ");
        p.name = s.nextLine();

        System.out.print("Enter the age of the patient : ");
        p.age = s.nextInt();

        System.out.print("Enter the gender of the patient : ");
        p.gender = s.next().charAt(0);

        System.out.print("Enter the insutance status of the patient : ");
        p.insurance = s.nextBoolean();

        System.out.print("Enter the fee of the patient : ");
        p.fee = s.nextDouble();

        p.display();
        s.close();
    }
}