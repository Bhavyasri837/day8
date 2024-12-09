import java.util.*;
public class thrice_indices {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int s=0;
    int k=0;
    for(int i=1;i<=n;i++)
    {
        s+=i;
        arr[k]=s;
        k++;
    }
    for(int i=0;i<n;i+=3)
    {
    System.out.print(arr[i]+" ");
} 
}
}