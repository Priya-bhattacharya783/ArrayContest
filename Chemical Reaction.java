Chemical Reaction
=================================================================



Energy of the two chemicals which produces maximum energy on reaction.

Input Format

The first line of the input consists of an integer - numOfChem , representing the number of chemicals (N).
The second line consists of N space separated integers - ener0, ener1,......., ener N 1 representing the energies of the chemicals.
Constraints

2 <= numOfChem <= 10^6
-10^6 <= ener1 <= 10^6
0 <= 1 <= numOfChem
Output Format

Print an integer representing the sum of energy of the two chemicals which produces maximum energy on reaction.
Sample Input 0

7
9 -3 8 -6 -7 8 10
Sample Output 0

19
Explanation 0

Here 9 and 10 product is Greater so its output is sum of that two number.

Contest ends in 2 hours
Submissions: 7
Max Score: 30
Difficulty: Easy
Rate This Challenge:

    
More
 

SOLUTION
==========================================

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
      
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
               {
                   secondmax=max;
                   max=arr[i];
                   
                   
               }
            else if(arr[i]>secondmax && arr[i]<max)
            {
                secondmax=arr[i];
            }
        }
        System.out.print(max+secondmax);
        
    }
}

