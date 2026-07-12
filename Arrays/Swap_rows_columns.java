package Arrays;

import java.util.Scanner;

class Swap_rows_columns{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int n = s.nextInt();

        int [][] arr = new int [m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = s.nextInt();
            }
        }

        for(int j = 0; j < n; j++){
            for(int i = 0; i < m; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}
