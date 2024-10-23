class BinarySearch
{
    int binarysearch( int a[],int n,int ele)
    {
        int low=0,high=n-1,mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(ele=a[mid])
            return mid;
            else if(ele<a[mid])
            high=mid-1;
            else
            low=mid+1;
            
        }
        return-1;
    
    }
}
class SearchDemo
{

public static void main(String args[])
{
    int n,i, se,pos;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of an array");
    n=sc.nextInt();
    int a[]=newInt(n);
    System.out.println("enter array elements");
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        
    }
    System.out.println("enter searching element");
    se=sc.nextInt();
        BinarySearch bs=new BinarySearch();
        pos=bs.binarysearch(a,n,se);
        if(pos=-1)
        System.out.println("element is not found");
        else
        System.out.println("element is found at"+a);
    
}
}
