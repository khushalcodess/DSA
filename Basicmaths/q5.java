/*
Problem Statement: Given an integer N, return all divisors of N.
A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

Examples
Input: N = 36
Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]  
Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
*/
package Basicmaths;

public class q5 {
    public static void main(String[] args) {
        int num = 36;
        for (int i = 1; i < num; i++) {
            if (num%i==0) {
                System.err.print(i+",");
            }
        }
    }
}
