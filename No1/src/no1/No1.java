/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	    
	// ini reverse
	    public static long fibo(int n){
        if(n <=1) return n;
        else return fibo(n-1) + fibo(n-2);
    }
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
		System.out.print("Masukkanpa deret fibonacci ? ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
			System.out.print(fibo(i) + " ");
		System.out.println();
	}

	private static int fibo(int n)
	{
		int f;
		if(n==1 || n==2)
			f=1;
		else
			f = fibo(n-1) + fibo(n-2);
		return f;
    }
	//Ini reverse
	System.out.print("\nInput: ");
        Scanner sh = new Scanner(System.in);
        data2 = sh.nextInt();
        System.out.println("Reverse");
        for(int i = data2; i >= 1; i--){
            System.out.print(fibo(i)+ " ");
        }
    
}
