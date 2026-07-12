package Arrays;

import java.util.Scanner;

class Frequency_element{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        if(n < 0){
            System.out.print("Invalid input");
            // return;
        }

        int[] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++){
            boolean counted = false;

            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    counted = true;
                    break;
                }
            }

            if(!counted){
                int count = 0;

                for(int j = i; j < n; j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }

                System.out.println(arr[i] + ": " + count);
            }
        }

        s.close();
    }
}
