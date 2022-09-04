import java.util.Scanner;

public class calculator
{
    public static void main(String args[])
    {
        int ans=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n*This is Simple Calculator*");
        while(true)
        {
            System.out.print("\nNOTE\n+ for addition\n- for substraction\n* for multiplication\n/ for divison\nEnter the Operators = ");
            char c = sc.next().trim().charAt(0);
            if(c == '+' || c == '-' || c == '*' || c == '/')
            {
                System.out.print("Enter the Two numbers : ");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                if(c == '+')
                {
                    ans = n1+n2;
                }
                if(c == '-')
                {
                    ans = n1-n2;
                }
                if(c == '*')
                {
                    ans = n1*n2;
                }
                if(c == '/')
                {
                    ans = n1/n2;
                }
            }
            else if (c == 'x' || c == 'X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input!");
            }
            System.out.println("The '"+ c +"' of two number is "+ ans);
        }  
    }
}