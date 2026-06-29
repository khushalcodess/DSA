/*
Check if a number is Palindrome or Not


18

Problem Statement: Given an integer N, return true if it is a palindrome else return false.

A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.
*/

package Basicmaths;

public class q3 {
    public static void main(String[] args) {
         int n = 7899;
        int rev = 0;
        int dup = n;
        while (n>0) {
            int lastdigit = (n % 10);
           
            rev = (rev*10) + lastdigit;
             n = n / 10 ;
            
        }

       if (dup == rev) {
            System.err.println("True");
       }
       else{
        System.err.println("False");
       }
    }
}
