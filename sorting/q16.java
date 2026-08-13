/*
Union of two sorted arrays
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
Output: [1, 2, 3, 4, 5, 7]
Explanation:
The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2
*/
import java.util.TreeSet;

public class q16 {
    public static int[] sortedArray(int[] a, int[] b) {

        int n1 = a.length;
        int n2 = b.length;

        TreeSet<Integer> st = new TreeSet<>();

        for (int i = 0; i < n1; i++) {
            st.add(a[i]);
        }


        for (int i = 0; i < n2; i++) {
            st.add(b[i]);
        }


        int[] temp = new int[st.size()];

        int index = 0;

        for (int it : st) {
            temp[index] = it;
            index++;
        }

        return temp;

    }
     public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 3, 5, 6};

        int[] result = sortedArray(a, b);

        System.out.println("Union of two arrays:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
