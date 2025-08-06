import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int mul=1;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j){
                    mul=mul*arr[j];
                }
                
                
            }
           
            System.out.print(mul+" ");
             mul=1;
        }
    }
}
