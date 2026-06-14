package Basic_Problems;

import java.util.Scanner;

class Storage_Distribution{
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);

        int storage = s.nextInt();

        int giga_byte = storage / 1024;
        int mega_byte = storage % 1024;

        System.out.println(giga_byte);
        System.out.println(mega_byte);

        s.close();
    }
}