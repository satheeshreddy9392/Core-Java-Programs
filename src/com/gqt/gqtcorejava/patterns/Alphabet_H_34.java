package com.gqt.gqtcorejava.patterns;

import java.util.Scanner;

public class Alphabet_H_34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		//outer loop
		
		for(int i=0;i<n;i++) {
			//inner loop
			for(int j=0;j<n;j++) {
				if( j==0|| i==n/2 || j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("      ");
			for(int j=0;j<n;j++) {
				if(j==0|| i==n/2  && j<=5|| j==(n/2)+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}

	}

}
