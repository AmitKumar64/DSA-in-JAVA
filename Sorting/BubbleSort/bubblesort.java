import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        System.out.println("Hello! Amit Kumar");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr[j],arr[j-1]);
                }
            }
        }
    }

    static void swap(int i,int k) {
        int temp = i;
        i = k;
        k = temp;
    }
}
