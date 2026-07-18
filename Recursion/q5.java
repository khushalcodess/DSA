//Reverse an array
package Recursion;
class Solution {

    public void reverse(int[] arr, int n) {
        reverseHelper(arr, 0, n - 1);
    }

    private void reverseHelper(int[] arr, int left, int right) {
       
        if (left >= right) {
            return;
        }

      
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

     
        reverseHelper(arr, left + 1, right - 1);
    }
}

public class q5 {
    public static void main(String[] args) {
        int[] arr = {1,5,6,3,2};
        int n = arr.length;
        Solution obj = new Solution();
        obj.reverse(arr, n);

        System.out.println("Reversed array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

       
    }
}