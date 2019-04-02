/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal8;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal8 {
      static int calculateSum(int n) 
    { 
        if (n <= 0) 
           return 0; 
        int fibo[]=new int[n+1]; 
        fibo[0] = 0; fibo[1] = 1; 
       
        // Initialize result 
        int sum = fibo[0] + fibo[1]; 
       
        // Add remaining terms 
        for (int i=2; i<=n; i++) 
        { 
            fibo[i] = fibo[i-1]+fibo[i-2]; 
            sum += fibo[i]; 
        }
        return sum; 
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci: ");
        int n = show.nextInt();
        long fib[] = new long[n];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
        }
    }
    
}
