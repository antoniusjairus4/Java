package Functions;
import java.util.Scanner;

public class fibonacci {
    public static int fib(int n){
        if(n <= 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int result = fib(n);

        System.out.print(result);
        s.close();
    }
}