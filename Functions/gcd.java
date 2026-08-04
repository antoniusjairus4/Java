package Functions;
import java.util.Scanner;

public class gcd {

    public static int findGCD(int a, int b){
        if(b == 0){
            return a;
        }

        return findGCD(b, a % b);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int result = findGCD(a, b);
        System.out.println(result);
        
        s.close();
    }
}
