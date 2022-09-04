
public class quicksort {
    public static void main(String[] args) {
        int[] arr = { 45, 34, 32, 15, 9, 31, 12,6};
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        printArray(arr);

    }

    static int partition(int[] arr, int s, int l) {
        int mid = s + (l - s) / 2;
        int pivot = arr[mid];

        while (s < l) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[l] > pivot) {
                l--;
            }
            if (s <= l) {
                // swap(arr, s, l);
                int temp = arr[s];
                arr[s] = arr[l];
                arr[l] = temp;
                s++;
                l--;
            }
        }
        return s;
    }

    static void quickSort(int[] arr, int low, int high) {
        int p = partition(arr, low, high);
        if (low < p - 1) {
            quickSort(arr, low, p - 1);
        }
        if (p < high) {
            quickSort(arr, p, high);
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            // l--;
        }
    }

    // static void swap(int[] arr, int start, int end) {
    // int temp = arr[start];
    // arr[start] = arr[end];
    // arr[end] = temp;
    // }
}
