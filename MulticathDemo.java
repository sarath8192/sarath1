class MulticatchDemo{
public static void main (String[] args) {
    int a= 0;
    int b=10/a;
    int c[]={1,2,3};
        try {
      
        System.out.println(c[6]);
        
    } catch(ArithmeticException ae) {
        System.out.println(ae);
    
    }
    catch(ArrayIndexOutOfBoundsException aie)
    {System.out.println(aie);}
}
}
