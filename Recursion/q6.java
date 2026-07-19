//Check if the given String is Palindrome or not
package Recursion;

class Solution {

    public boolean isPalindrome(String str) {
        return check(str, 0, str.length() - 1);
    }

    public boolean check(String str, int left, int right) {

        // Base Case
        if (left >= right) {
            return true;
        }

        // If characters are different
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive Call
        return check(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String str = "ABCDCBA";

        if (obj.isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}