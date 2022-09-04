import java.util.Scanner;

class first{
    String name;
    int id;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name : ");
        name=sc.nextLine();
        System.out.print("Enter your ID : ");
        id=sc.nextInt();
    }
    void detail(){
        System.out.println("Your name is - "+name);
        System.out.println("Your id is - " +id);
    }
}
class balance{
    public static void main(String[] args){
        first harry= new first();
        harry.input();
        harry.detail();
    }
}