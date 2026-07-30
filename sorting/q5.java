import java.util.Scanner;

public class q5 {

    public static void bubbleSort(int[] nums) {
        bubble(nums, nums.length);
    }

    static void bubble(int[] arr, int n) {

  
        if (n == 1) {
            return;
        }

     
        boolean swapped = bubbleHelper(arr, 0, n, false);

        if (!swapped) {
            return;
        }

        bubble(arr, n - 1);
    }

    static boolean bubbleHelper(int[] arr, int i, int n, boolean swapped) {

        if (i == n - 1) {
            return swapped;
        }

     
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            swapped = true;
        }

        return bubbleHelper(arr, i + 1, n, swapped);
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

        bubbleSort(arr);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}