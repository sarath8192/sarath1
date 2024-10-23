class Constructor
{
    int a,b;
    Constructor()
    {
        a=0;
        b=0;
    }
    Constructor(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        System.out.println("a="+a+"b="+b);
        
        
    }
}
class ConstructorovetloadDemo
{
    public static void main(String args[])
    {
        Constructor c1=new Constructor();
        Constructor c2=new Constructor(2,4);
       
        c1.display();
        c2.display();
       

    }
}
