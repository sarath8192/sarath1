class ExceptionMain{
public static void main (String[] args) {
    int a,b,c;
    try {
        a=0;
        b=5/4;
        c=b/a;
        System.out.println(c);
        
    } catch(ArithmeticException ae) {
        System.out.println("welcome");
    }
}
}