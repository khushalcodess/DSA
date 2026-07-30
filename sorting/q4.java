package sorting;

/*
Merge Sorting
Example 1

Input: nums = [7, 4, 1, 5, 3]

Output: [1, 3, 4, 5, 7]

Explanation: 1 <= 3 <= 4 <= 5 <= 7.

Thus the array is sorted in non-decreasing order.
*/
import java.util.*;

public class q4 {

    // Merge function
    public static void merge(int[] arr, int low, int mid, int high) {

       
        ArrayList<Integer> temp = new ArrayList<>();

        
        int left = low;

       
        int right = mid + 1;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

       
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

       
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

      
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // Merge Sort function
    public static void mergeSort(int[] arr, int low, int high) {

      
        if (low >= high)
            return;

        
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);


        mergeSort(arr, mid + 1, high);

  
        merge(arr, low, mid, high);
    }

    // Main function
    public static void main(String[] args) {

        int[] arr = {7, 4, 1, 5, 3};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}