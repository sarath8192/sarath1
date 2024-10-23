class A
{
    void show()
    {
        System.out.println("Method in super class");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("Method in sub class 1");
    }
}
class C extends B
{
    void show()
    {
        System.out.println("Methods in sub class 2");
    }
}
class Runpoly
{
    public static void main(String args [])
    {
        A a;
        A a1=new A();
        B b1=new B();
        C c1=new C();
        a=a1;
        a.show();
        a=b1;
        a.show();
        a=c1;
        a.show();
    }
}
