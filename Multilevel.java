class A
{
    A()
    {
        System.out.println("Constructor in A");
    }
}
class B extends A
{
    B()
    {
        System.out.println("Constructor in B");
    }
}
class C extends B
{
    C()
    {
        System.out.println("Constructor in C");
    }
}
class Multilevel
{
    public static void main(String args[])
    {
        C c1=new C();
    }
}
