
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

\
        cnt += merge(arr, low, mid, high);

        return cnt;
    }
\
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
