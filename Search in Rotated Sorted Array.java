import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        String []str=s.trim().split("\\s+");
        int[]arr=new int[str.length];
        
        for(int i=0;i<str.length;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
            if(arr[i]==k)
            {
                System.out.print(i);
                return;
            }
            
        }
        
        System.out.print(-1);
        }
 }
