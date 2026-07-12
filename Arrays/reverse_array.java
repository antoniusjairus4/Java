package Arrays;

import java.util.Scanner;

class reverse_array{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        if(n <= 0){
            System.out.print("Invalid input");
        }

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

        s.close();
    }
}
