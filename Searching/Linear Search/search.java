import java.util.*;

class search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
         System.out.print("Enter the number of the element : ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target number : ");
        int target = sc.nextInt();
        int ans = find(arr, target);
        System.out.println("The index of target number is : "+ans);
    }
    static int find(int[] arr, int target)
    {
       
        for(int i = 0 ; i < arr.length ; i++)
        {
            int element = arr[i];
            if(element == target)
            {
                return i;
            } 
        }
        return -1;
    }
    
}