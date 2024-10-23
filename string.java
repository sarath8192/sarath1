import java.util.*;
class Main
{
    public static void main(String args[])
    {
    
        Scanner sc=new Scanner(System.in);
        String sb=new String();
        sb=sc.nextLine();
        String st=new String();
        for(int i=sb.length()-1;i>=0;i--)
        {
            st=st+sb.charAt(i);
        }
            if(sb.equals(st))
            {
                System.out.println("given stirng is palindrome");
            }
                else
                {
                    System.out.println("given stirng is not palindrome");
                }
            }
        }
    
    
