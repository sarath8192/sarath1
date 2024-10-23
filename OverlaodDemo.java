class Overload
{
    void display()
    {
        System.out.println("no parameters");
 
   }
   void dispaly(int a,int b)
   {
       System.out.println("a="+a+"b="+b);
   }
}
class OverloadDemo
{
    public static void main(String args[])
    {
        Overload ol=new Overload();
        ol.display();
        ol.dispaly(10,20);
    }
}
