package Array;

import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt() ;       
      

        int count=0;

        for(int i=a;i<b;i++){
            count++;
            
        }
        System.err.println(count);
    }
    
}
