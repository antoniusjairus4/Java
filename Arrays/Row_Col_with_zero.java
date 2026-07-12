package Arrays;

import java.util.Scanner;

class Row_Col_with_zero{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        if(m <= 0 || n <= 0){
            System.out.print("Invalid input");
            return;
        }

        int [][] arr = new int[m][n];
        int zero_count = 0;
        int fault_row = -1;
        int fault_col = -1;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = s.nextInt();

                if(arr[i][j] == 0){
                    zero_count++;
                    fault_row = i;
                    fault_col = j;
                }
            }
        }

        if(zero_count != 1){
            System.out.print("Invalid input");
            return;
        }

        for(int i = 0; i < m; i++){
            arr[i][fault_col] = 0;
        }

        for(int j = 0; j < n; j++){
            arr[fault_row][j] = 0;
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        s.close();
    }
}
