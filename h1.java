import java.io.*;
import java.util.*;

public class h1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inp1=new Scanner(System.in);
        Scanner inp=new Scanner(System.in).useDelimiter("[,\\s+]");
        int x=inp1.nextInt();
        String arr[]=new String[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=inp.next();
        }
       
        for(int j=x-1;j>=0;j--)
        {
            System.out.print(arr[j]+" ");
        }
    }
}