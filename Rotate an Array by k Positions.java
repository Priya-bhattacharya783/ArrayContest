import java.io.*;
import java.util.*;

public class Solution {
    static void reverse(int[] arr,int s,int e)
    {
        while(s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        int k1;
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=k%n;
        reverse(arr,0,n-1);//54321
        reverse(arr,0,k-1);//45321
        reverse(arr,k,n-1);//45123
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}
