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
