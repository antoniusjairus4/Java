package Arrays;

import java.util.Scanner;

class Odd_Even_count{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        if(n < 1 || n > 100){
            System.out.print("Invalid input");
       }

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        int odd_count = 0;
        int even_count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }

        System.out.println("Even Count: " + even_count);
        System.out.println("Odd Count: " + odd_count);

        s.close();
    }
}