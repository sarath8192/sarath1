import java.util.*;
class Roots
{
     public static void main (String[] args) {
        double a,b,c,d,r1,r2;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=b*b-4*a*c;
        if(d==0)
        {
            
            System.out.println("roots are real and equal");
            r1=r2=b/(2*a);
            System.out.println("root1="+r1+""+"root2="+r2);
            }
            else if(d>0)
            {
                System.out.println("roots are real and distinct");
                r1=(-b+Math.sqrt(d))/(2*a);
                r2=(-b-Math.sqrt(d))/(2*a);
                System.out.println("root1="+r1+""+"root2="+r2);
            }
            else
            System.out.println("roots are imaginary");
    }
}
