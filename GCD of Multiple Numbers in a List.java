import java.io.*;
import java.util.*;

public class Solution {
     static long gcd(long a,long b)
     {
         if(b==0)
             return a;
         
         else
             return gcd(b,a%b);
         
     }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a=sc.nextLong();
        
        for(int i=1;i<n;i++)
        {
            long b=sc.nextLong();
            a=gcd(a,b);
        }
        System.out.print(a);
        
    }
}
