/*
131. Count Inversions
Optimal approach 
Given an integer array nums. Return the number of inversions in the array.

Two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

It indicates how close an array is to being sorted.
A sorted array has an inversion count of 0.
An array sorted in descending order has maximum inversion.
Example 1:
Input: nums = [2, 3, 7, 1, 3, 5]

Output: 5

Explanation:

The responsible indexes are:

nums[0], nums[3], values: 2 > 1 & indexes: 0 < 3

nums[1], nums[3], values: 3 > 1 & indexes: 1 < 3

nums[2], nums[3], values: 7 > 1 & indexes: 2 < 3

nums[2], nums[4], values: 7 > 3 & indexes: 2 < 4

nums[2], nums[5], values: 7 > 5 & indexes: 2 < 5
*/
import java.util.*;

public class q52 {

    static long merge(int[] arr, int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        long cnt = 0;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {

                temp.add(arr[left]);
                left++;

            } else {

                temp.add(arr[right]);

                cnt += (mid - left + 1);

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

        return cnt;
    }


    static long mergeSort(int[] arr, int low, int high) {

        long cnt = 0;

        if (low >= high) {
            return cnt;
        }

        int mid = (low + high) / 2;


        cnt += mergeSort(arr, low, mid);

     
        cnt += mergeSort(arr, mid + 1, high);


        cnt += merge(arr, low, mid, high);

        return cnt;
    }

    static long numberOfInversions(int[] a, int n) {

        return mergeSort(a, 0, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 4, 1};

        int n = arr.length;

        long ans = numberOfInversions(arr, n);

        System.out.println("Number of inversions: " + ans);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
