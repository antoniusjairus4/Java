package Arrays;
import java.util.Scanner;

public class multiply_all_elements_other_than_tht {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++){
            int pdt = 1;
            
            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }

                pdt *= arr[j];
            }

            System.out.print(pdt + " ");
        }

        s.close();
    }
}
