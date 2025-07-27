import java.io.*;
import java.util.*;

public class Solution {
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        
        
        while (left<right)
        {
            if(arr[left]==arr[right])
            {
                left++;
                right--;
            }
            else if(arr[left]<arr[right]){
                arr[left+1]=arr[left]+arr[left+1];
                c++;
                left++;  
            }
            else{
                arr[right-1]=arr[right-1]+arr[right];
                c++;
                right--;
            }
        }
        System.out.print(c);
        
    }
}
