import java.util.*;
public class summiddle {
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
    int midsum=arr[n/2];
    System.out.println(midsum);
    }
    
}
