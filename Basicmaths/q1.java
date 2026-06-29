/*
You are given an integer n. You need to return the number of digits in the number.



The number will have no leading zeroes, except when the number is 0 itself.


Example 1

Input: n = 4

Output: 1

Explanation: There is only 1 digit in 4.
*/


package Basicmaths;
public class q1 {
    public static void main(String[] args) {
       int n = 7899;
       int count = 0 ; 

       while (n > 0) {
           int lastdigit = n % 10;
           count++;
            n = n / 10 ;
       }
       System.err.println("Total number are :-" + count);
    }
}
