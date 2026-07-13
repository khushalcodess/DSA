//Print N to 1 using Recursion
import java.util.Scanner;

public class q2 {

    public static void printNumbers(int n) {
       
        if (n == 0) {
            return;
        }

       
        System.out.println(n);

         printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printNumbers(n);

        sc.close();
    }
}