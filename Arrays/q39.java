/*
161. Pascal's Triangle I
Example 1:
Input: r = 4, c = 2

Output: 3

Explanation:

The Pascal's Triangle is as follows:

1

1 1

1 2 1

1 3 3 1

....

Thus, value at row 4 and column 2 = 3
*/

class q39 {

    public static int pascalTriangle(int r, int c) {

       
        r = r - 1;
        c = c - 1;

        int res = 1;

        for (int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);
        }

        return res;
    }

    public static void main(String[] args) {

        int r = 4;
        int c = 2;

        System.out.println(pascalTriangle(r, c));
    }
}