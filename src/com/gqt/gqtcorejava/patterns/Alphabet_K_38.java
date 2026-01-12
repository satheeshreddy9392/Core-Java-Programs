package com.gqt.gqtcorejava.patterns;

import java.util.Scanner;

public class Alphabet_K_38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		//outer loop
		
		for(int i=0;i<n;i++) {
			System.out.print("     ");
			//inner loop
			for(int j=0;j<n;j++) {
				
				if( j==0  || i+j==n/2 || i-j==n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}

	}

}
