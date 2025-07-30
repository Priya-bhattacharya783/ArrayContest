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
