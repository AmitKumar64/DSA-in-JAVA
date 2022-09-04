import java.util.Scanner;

class fibo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int i =sc.nextInt();
        int a=0,b=1,n=2;
        while (n <= i)
        {
            int temp=b;
            b=b+a;
            a=temp; 
            n++;
        }
        System.out.println("The sum of "+i+" term is "+b);
    }
}