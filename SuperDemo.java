class A
{
    int a,b;
    A(int x,int y)
    {
        a=x;
        b=y;
    }
    void shape()
    {
        System.out.println("a="+a+"b="+b);
    }
}
class B extends A
{
    int c;
    B(int x,int y,int z)
    {
        super(x,y);
        c=z;
    }
    void show()
    {
        System.out.println("c="+c);
    }
}
class SuperDemo
{
    public static void main(String args[])
    {
        B b=new B(10,20,30);
    }
}
