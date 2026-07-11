package Strings;

import java.util.Scanner;

class Alternate_text{
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String text = s.nextLine().trim();

        if(text.isEmpty() || !text.matches("[a-zA-Z]+")){
            System.out.println("Invalid input");
            s.close();
            return;
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);

            if(i % 2 == 0){
                result.append(Character.toUpperCase(ch));
            }
            else{
                result.append(Character.toLowerCase(ch));
            }
        }

        System.out.println(result.toString());
        s.close();
    }
}
