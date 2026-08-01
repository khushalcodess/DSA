/*
Recursive Insertion Sort
Example 1

Input: nums = [7, 4, 1, 5, 3]

Output: [1, 3, 4, 5, 7]

Explanation: 1 <= 3 <= 4 <= 5 <= 7.

Thus the array is sorted in non-decreasing order.
*/
import java.util.Scanner;


public class q6 {
    public static void insertionSort(int[] nums) {
        insert(nums, 1);
    }
    public static  void insert(int[] nums,int index){
        if (index == nums.length) {
            return;
        }

        int cur = nums[index];
        int j = index - 1;

        while (j>=0 && nums[j]>cur) {
            nums[j + 1] = nums[j];
            j--;
        }
         nums[j + 1] = cur;

        insert(nums, index + 1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }    
}
