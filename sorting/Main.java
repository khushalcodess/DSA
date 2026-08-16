/*
Union of two sorted arrays
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
Output: [1, 2, 3, 4, 5, 7]
Explanation:
The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2
*/
import java.util.*;

public class Main {

    public static int[] unionArray(int[] a, int[] b) {

        int n1 = a.length;
        int n2 = b.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> unionArr = new ArrayList<>();

        while (i < n1 && j < n2) {

            if (a[i] <= b[j]) {

                if (unionArr.size() == 0 ||
                    unionArr.get(unionArr.size() - 1) != a[i]) {

                    unionArr.add(a[i]);
                }

                i++;

            } else {

                if (unionArr.size() == 0 ||
                    unionArr.get(unionArr.size() - 1) != b[j]) {

                    unionArr.add(b[j]);
                }

                j++;
            }
        }

        while (i < n1) {
            if (unionArr.size() == 0 ||
                unionArr.get(unionArr.size() - 1) != a[i]) {

                unionArr.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (unionArr.size() == 0 ||
                unionArr.get(unionArr.size() - 1) != b[j]) {

                unionArr.add(b[j]);
            }
            j++;
        }

        // Convert ArrayList<Integer> to int[]
        int[] result = new int[unionArr.size()];

        for (int k = 0; k < unionArr.size(); k++) {
            result[k] = unionArr.get(k);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4, 6, 7};

        int[] result = unionArray(a, b);

        System.out.println(Arrays.toString(result));
    }
} 