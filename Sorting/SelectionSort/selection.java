import java.util.*;

public class selection {
    public static void main(String[] args) {
        /*
         * System.out.println("Hello! Amit Kumar");
         * Scanner sc = new Scanner(System.in);
         * System.out.print("Enter the length : ");
         * int n = sc.nextInt();
         * int[] arr = new int[n];
         * for (int i = 0; i < n; i++) {
         * arr[i] = sc.nextInt();
         * }
         * for (int i = 0; i < n; i++) {
         * System.out.print(arr[i]);
         * }
         */
        int[] arr = { 1, 4, 7, 6, 3, 2 };
        selectsort(arr);
        System.out.println("\n" + Arrays.toString(arr));
    }

    static void selectsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
