package com.gqt.gqtcorejava.patterns;

import java.util.Scanner;

public class Alphabet_D_30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		//outer loop
		
		for(int i=0;i<n;i++) {
			//inner loop
			for(int j=0;j<n;j++) {
				if(i==0 || j==0|| j==n-1 || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("      ");
			for(int j=0;j<n;j++) {
				if(i==0 && j!=n-1  || j==0|| j==n-1 && i!=0  && i!=n-1  || i==n-1 && j!=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}

	}

}
