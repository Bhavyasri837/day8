import java.util.*;
public class sum_of_n_num
{
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
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
        }
}