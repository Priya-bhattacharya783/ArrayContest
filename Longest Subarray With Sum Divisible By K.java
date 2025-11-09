Examples:

Input: arr[] = [2, 7, 6, 1, 4, 5], k = 3
Output: 4
Explanation: The subarray [7, 6, 1, 4] has sum = 18, which is divisible by 3.

Input: arr[] = [-2, 2, -5, 12, -11, -1, 7], k = 3
Output: 5
Explanation: The subarray [2, -5, 12, -11, -1], has sum = -3, which is divisible by 3.

Input: arr[] = [1, 2, -2], k = 5
Output: 2
Explanation: The subarray is [2, -2] with sum = 0, which is divisible by 5.
===============================================================================================================
    
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), i, j, sum=0, max=0;
        int a[] = new int [n];
        
        for(i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        
        for(i = 0 ; i < n ; i++){
            sum = 0 ;
            for(j = i; j < n; j++){
                sum = sum + a[j];
                if(sum % k == 0)
                    max = Math.max(max, j-i+1);
            }
        }
        
        System.out.println(max);
        
    }
}
