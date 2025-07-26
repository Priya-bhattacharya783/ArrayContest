import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.trim().split("\\s+");
        
        for(int i = Integer.parseInt(a[0]) ; i <= Integer.parseInt(a[1]); i++){
            if(i % 2 == 0|| i % 5 == 0)
           System.out.print(i+" "); 
        }
    }
}
