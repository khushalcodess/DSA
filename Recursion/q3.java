//Sum of First N Numbers
import java.util.Scanner;

public class q3 {

    public int NnumbersSum(int N) {
        if (N == 0) {
            return 0;
        }

        return N + NnumbersSum(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        q3 obj = new q3();              // Create object
        int sum = obj.NnumbersSum(n);   // Call method

        System.out.println("Sum = " + sum);

        sc.close();
    }
}