import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int[n], i, left = 0, right = n-1, max = 0;
        for(i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        while(left < right){
            int width = right - left;
            
            int height = Math.min(a[left],a[right]);
            
            max = Math.max(max, (width*height));
            
                
            if(a[left] < a[right])
            left++;
            else
            right--;
        }
        
        System.out.println(max);
        
    }
}
