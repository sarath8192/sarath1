import java.util.*;

class Sort {
    public static void main(String args[]) {
        int n, i, j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of list");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("After sorting elements are");
    
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
