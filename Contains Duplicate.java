import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] parts=s.trim().split("\\s+");
        
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<parts.length;i++)
        {
            set.add(parts[i]);
            
        }
        if(parts.length!=set.size())
        {
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}
