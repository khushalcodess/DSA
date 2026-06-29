/*
Problem Statement: Given an integer N return the reverse of the given number.

Note: If a number has trailing zeros, then its reverse will not include them. For e.g , reverse of 10400 will be 401 instead of 00401.
*/
package Basicmaths;

public class q2 {
    public static void main(String[] args) {
        int n = 7899;
        int rev = 0;

        while (n>0) {
            int lastdigit = (n % 10);
           
            rev = (rev*10) + lastdigit;
             n = n / 10 ;
            
        }
        
        System.err.println("Reverse Number Is :-" + rev);
    }
}
