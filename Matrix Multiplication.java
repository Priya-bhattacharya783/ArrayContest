import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt(), q=sc.nextInt(),r=sc.nextInt();
        int [][] a= new int[p][q];
        int [][] b= new int[q][r];
        int i,j,k;
        int c[][] = new int[p][r];
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                 a[i][j]=sc.nextInt();
                
            }
            
        }
        for(i=0;i<q;i++)
        {
            for(j=0;j<r;j++)
            {
                 b[i][j]=sc.nextInt();
                
            }
            
        }
        for(i=0; i<p; i++ )
        {
            for(j=0; j<r; j++)
            {
                for(k=0;k<q;k++)
                {
                    c[i][j]+= a[i][k]*b[k][j];
                }
            }
        }
        for(i = 0; i<p; i++){
            for(j=0; j<r; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
