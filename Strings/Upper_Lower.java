package Strings;

import java.util.Scanner;

class Upper_Lower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();
        
        int upper = 0;
        int lower = 0;

        for (char c : str.toCharArray()) {

            if (Character.isDigit(c)) {
                System.out.println("Invalid input");
                s.close();
                return;
            } 

            else if (Character.isUpperCase(c)) {
                upper++;
            } 

            else if (Character.isLowerCase(c)) {
                lower++;
            }
        }

        // These lines will ONLY print if no digits were found
        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        
        s.close();
    }
}