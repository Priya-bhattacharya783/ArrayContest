import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        
        int start=0;
        int end=start+m-1;
        
        int mindiff=arr[end-start] ;
        int windows= n-m+1;
        
        for(int i=0;i<windows;i++)
        {
            int diff= arr[end]-arr[start];
            if(diff<mindiff)
            {
              mindiff=diff;  
            }
            start++;
            end++;
        }
        System.out.print(mindiff);
        
    }
}
