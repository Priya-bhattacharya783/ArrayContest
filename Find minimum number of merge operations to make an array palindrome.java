Given an array of positive integers. 
We need to make the given array a 'Palindrome'. 
The only allowed operation is"merging" (of two adjacent elements). Merging two adjacent elements means replacing them with their sum. 
The task is to find the minimum number of merge operations required to make the given array a 'Palindrome'.

example :
Input: arr[] = {1, 4, 5, 9, 1}
i=0, j=4, arr[0]=1, arr[4]=1. arr[i] == arr[j]. i=1, j=3.
i=1, j=3, arr[1]=4, arr[3]=9. arr[i] < arr[j]. Merge arr[1] with arr[2]. arr becomes {1, 9, 5, 9, 1} (conceptually, arr[2] is now 5+4=9). i=2, ans=1.
i=2, j=3, arr[2]=9, arr[3]=9. arr[i] == arr[j]. i=3, j=2.
i > j. Loop terminates.
Output: ans = 1
============================================================================================================================================================

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
