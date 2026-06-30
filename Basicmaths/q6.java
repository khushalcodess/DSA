/*
Check if a number is Armstrong Number or not

Example 1:
Input: N = 153
Output: True
Explanation: 1^3 + 5^3 + 3^3 = 153

Example 2:
Input: N = 371
Output: True
Explanation: 3^3 + 7^3 + 1^3 = 371
*/

package Basicmaths;

public class q6 {

    public boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int n = 153;

        q6 obj = new q6();

        if (obj.isArmstrong(n)) {
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is not an Armstrong Number");
        }
    }
}