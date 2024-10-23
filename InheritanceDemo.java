class A
{
    int i,j;
    void shape()
    {
        System.out.println("i="+i+"j="+j);
    }
}
class B extends A
{
    int k;
    void display()
    {
        System.out.println("k="+k);
    }
    void sum()
    {
        System.out.println("sum="+(i+j+k));
    }
}
class Inheritancedemo
{
    public static void main(String args[])
    {
        B b=new B();
        b.i=20;
        b.j=40;
        b.k=60;
        b.shape();
        b.display();
        b.sum();
    }
}
