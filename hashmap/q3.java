/*
Highest Occurring Element in an Array
Input: nums = [1, 2, 2, 3, 3, 3]

Output: 3

Explanation: The number 3 appears the most (3 times). It is the most frequent element.
*/

import java.util.*;

public class q3 {

    public static int mostFrequentElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

    
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                ans = num;
            } else if (freq == maxFreq && num < ans) {
                ans = num;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 3, 3};

        System.out.println("Most Frequent Element: " + mostFrequentElement(nums));

        int[] nums2 = {4, 4, 5, 5, 6};

        System.out.println("Most Frequent Element: " + mostFrequentElement(nums2));
    }
}