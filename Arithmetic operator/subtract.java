import java.util.Scanner;

class subtract{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number : ");
        float a = sc.nextFloat();
        System.out.println("Enter the second number : ");
        float b = sc.nextFloat();
        System.out.println("\n Subtration of "+a+" and "+b+" is : "+ (a-b));
    }
}