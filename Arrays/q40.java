/*
378. Pascal's Triangle II
Example 1:
Input: r = 4

Output: [1, 3, 3, 1]

Explanation:

The Pascal's Triangle is as follows:

1

1 1

1 2 1

1 3 3 1

....

Thus the 4th row is [1, 3, 3, 1]
....

Thus, value at row 4 and column 2 = 3
*/

class q40 {

     public static int[] pascalTriangleII(int r) {
        int res = 1;
        int[] ans = new int[r];
  
       
        for(int i = 0;i<r;i++){
            ans[i] = res;
             res = res * (r - 1 - i);
            res = res / (i + 1);
            
        }
        return ans;
    }

    public static void main(String[] args) {

        int r = 4;
        

        System.out.println(pascalTriangleII(r));
    }
}