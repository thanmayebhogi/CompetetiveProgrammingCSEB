import java.io.*;
import java.util.*;

public class Solution {
 static int fact(int n){
    
            if(n==0 || n==1){
            return 1;
        }
           return n*fact(n-1);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        System.out.print(fact(n));
        }
        
        
}


