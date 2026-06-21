package Arrays;

import java.util.Scanner;

public class Pin_Evaluator {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);

        int n = 4;
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        int odd_count = 0;
        int even_count = 0;

        System.out.println("Enter your pin : ");
        
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                even_count++;
            }

            else{
                odd_count++;
            }
        }

        System.out.print("Odd count : " + odd_count);
        System.out.print(" Even count : " + even_count);

        s.close();
    }
}
