//Factorial of a given number
import java.util.Scanner;

public class q4 {

      public int factorial(int n) {
        int f = n;
        if(n == 0){
            return 1;
        }
        f *= factorial(n-1);
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        q4 obj = new q4();              // Create object
        int factorial = obj.factorial(n);   // Call method

        System.out.println("factorial = " + factorial);

        sc.close();
    }
}