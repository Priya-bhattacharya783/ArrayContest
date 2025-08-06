import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int s=0;
        int l=n-1;
        int res=-1;
        
        while(s<=l)
        {
            int mid=(s+l)/2;
            if(arr[mid]==t){
                res=mid;
                break;
            }
            else if(t<arr[mid])
            {
                l=mid-1;
            }
            else{
                s=mid+1;
            }
            
        }
        System.out.print(res);
       
        
    }
}
