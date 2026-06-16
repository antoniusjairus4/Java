package Arrays;

import java.util.Scanner;

class Multiply_other_elements{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++){
            int mul = 1;
            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }
                else{
                    mul = mul * arr[j];
                }
            }
            System.out.print(mul + " ");
        }

        s.close();
    }
}
