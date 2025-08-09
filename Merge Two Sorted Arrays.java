import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
           
        }
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
            
        }
        int i=0;
        int j=0;
        ArrayList<Integer>list=new ArrayList<>();
        while(i<n1 && j<n2)
        {
           if(arr1[i]<=arr2[j])
           {
               list.add(arr1[i]);
               i++;
           }
            else{
                list.add(arr2[j]);
                j++;
            }
        }
        while(i<n1)
        {
            list.add(arr1[i]);
            i++;
        }
        while(j<n2)
        {
            list.add(arr2[j]);
            j++;
        }
        
        for(int k=0;k<list.size();k++)
        {
            System.out.print(list.get(k)+" ");
        }
        
    }
}
        
        
