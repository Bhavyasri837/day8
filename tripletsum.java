import java.util.*;
public class tripletsum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n-2;i++)
        {
            if(i>0 &&arr[i]==arr[i-1])
        {
            continue;
        }
        int l=i+1;
        int r=n-1;
        while(l<r)
        {
            int sum=arr[i]+arr[l]+arr[r];
            if(sum==0)
            {
                System.out.println(arr[i]+","+arr[l]+","+arr[r]);
                l++;
                r--;
                while(l<r&&arr[l]==arr[l-1])
                {
                    l++;
                }
                while(l<r&&arr[r]==arr[r+1])
                {
                    r--;
                }
            }
            else if(sum<0)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        }
    }
    
}
