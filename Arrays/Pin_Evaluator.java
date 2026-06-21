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
    }
}
