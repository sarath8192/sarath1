abstract class Shape
{
    double dim1,dim2;
    Shape(double x,double y)
    {
        dim1=x;
        dim2=y;
    }
    abstract double area();
}
class Triangle extends Shape
{
    Triangle(double a,double b)
    {
        super(a,b);
    }
    double area()
    {
        return 0.5*dim1*dim2;
    }
}
class Rectangle extends Shape
{
    Rectangle(double i,double j)
    {
        super(i,j);
    }
    double area()
    {
        return dim1*dim2;
    }
}
class AreaDemo
{
    public static void main(String args[])
    {
        Shape s;
        Triangle t=new Triangle(3,4.5);
        s=t;
        System.out.println("Area of a triangle="+s.area());
        Rectangle r=new Rectangle(6.5,7.5);
        s=r;
        System.out.println("Area of rectangle="+s.area());
    }
}
