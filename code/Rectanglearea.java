class Rectangle
{
    int lenght,width;
    Rectangle(int x, int y)
    {
        lenght=x;
        width=y;
    }
    int rectarea()
    {
        return(lenght*width); 
    }
}
class Rectanglearea
{
    public static void main (String args[])
    {
        Rectangle rect1=new Rectangle(15,10);
        int area1=rect1.rectarea();
        System.out.println("area1 = "+ area1);
    }
}