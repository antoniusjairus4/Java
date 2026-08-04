package Arrays;
import java.util.Scanner;

public class rotated_array {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        
        s.close();
    }
}