import java.util.*;

class revarr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        // int[] arr = {34,234,435,24536,34,2345};
        // swap(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while(start < end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}