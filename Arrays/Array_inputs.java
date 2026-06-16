package Arrays;

import java.util.Scanner;

class Array_inputs{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        if(n < 0){
            System.out.print("Invalid input");
            return;
        }

        int[] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
            if(arr[i] < 0){
                System.out.print("Invalid input");
                return;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        s.close();
    }
}