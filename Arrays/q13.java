/*
Find missing number
Input: nums = [0, 2, 3, 1, 4]

Output: 5

Explanation:

nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]
*/
package Arrays;

public class q13 {

     public static int missingNumber(int[] arr, int N) {

     
        int[] hash = new int[N + 1];

 
        for (int i = 0; i < N - 1; i++) {
            hash[arr[i]] = 1;
        }

   
        for (int i = 1; i <= N; i++) {

            if (hash[i] == 0) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int N = 5;

        int answer = missingNumber(arr, N);

        System.out.println("Missing number = " + answer);
    }
}
