/*
Check if a number is Palindrome or Not


18

Problem Statement: Given an integer N, return true if it is a palindrome else return false.

A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.
*/

package Basicmaths;

public class q4 {
    public static void main(String[] args) {
        int n = 371;
        int newnum = 0;
       int dup = n;
        while (n>0) {
            int lastdigit = (n % 10);
           
            newnum += lastdigit*lastdigit*lastdigit; 
             n = n / 10 ;
            
        }
        System.err.println(newnum);
       if (dup == newnum) {
            System.err.println("Yes This Number Is Palimbrom");
       }
       else{
        System.err.println("No This Number Is Palimbrom");
       }
    }
}
