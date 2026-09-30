/*
945. Pascal's Triangle III
Example 1:
Input: n = 4

Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]
Explanation: The Pascal's Triangle is as follows:

1
1 1
1 2 1
1 3 3 1
1st Row has its value set to 1.
All other cells take their value as the sum of the values directly above them
*/

import java.util.ArrayList;
import java.util.List;

class q41 {

    public static  List<List<Integer>> generate(int n) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 1; row <= n; row++) {

            List<Integer> temp = new ArrayList<>();

            int res = 1;
            temp.add(res);

            for (int col = 1; col < row; col++) {

                res = res * (row - col) / col;

                temp.add(res);
            }

            ans.add(temp);
        }

        return ans;
    }

    public static void main(String[] args) {

        int r = 4;
        

        System.out.println(generate(r));
    }
}