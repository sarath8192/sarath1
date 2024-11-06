class ExceptionMain{
public static void main (String[] args) {
    int a,b,c;
    try {
        a=0;
        b=5/a;
        c=b/a;
        System.out.println(c);
        
    } catch(ArithmeticException ae) {
        System.out.println("arthematic expetion");
    }
}
}
