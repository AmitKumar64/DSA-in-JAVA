import java.util.Scanner;
 
class star{
    public static void main(String args[]){
        int p,q;
        System.out.print("the right angel triangle of@ is shown below:\n");
        for(p = 1 ; p <= 9 ; p++ )
        {
            for(q=1;q<=p;q++)
            {
                System.out.print(" *");
            }
            System.out.println("  ");
        }
    }
}