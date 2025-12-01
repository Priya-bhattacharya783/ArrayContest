Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.

Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.
=================================================================================
    
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=s.trim().split("\\s+");
        int[] arr=new int[a.length];
        
        
        for (int i=0;i<a.length;i++) {
             arr[i]=Integer.parseInt(a[i]);
        }
        //kadane's algorithm
        int currsum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            currsum=(int)Math.max(arr[i],currsum+arr[i]);
            maxsum=(int)Math.max(maxsum,currsum);
        }
        

        System.out.println(maxsum);
        
    }
}
