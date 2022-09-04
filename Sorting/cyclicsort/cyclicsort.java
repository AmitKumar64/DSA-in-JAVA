import java.util.*;

public class cyclicsort {
    public static void main(String[] args){
        int[] arr = {2,4,3,5,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int i = 0;
        while(i<arr.length) {
            int index = arr[i]-1;
            if(arr[i] != arr[index]){
                swap(arr,i,index);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }
}
