import java.util.*;

public class medianTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 5, 6, 8 };
        array(arr1,arr2);
    }

    static void array(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] arr3 = new int[length];
        int i = 0;
        for (int element : arr1) {
            arr3[i] = element;
            i++;
        }
        for (int element : arr2) {
            arr3[i] = element;
            i++;
        }
    }
}
