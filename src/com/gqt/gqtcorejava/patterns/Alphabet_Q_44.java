package com.gqt.gqtcorejava.patterns;

import java.util.Scanner;

public class Alphabet_Q_44 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		//outer loop
		
		for(int i=0;i<n;i++) {
			//inner loop
			for(int j=0;j<n;j++) {
				if(i==0 && i+j<=(n/4)*3 || j==0 && i<=(n/4)*3 || j==(n/4)*3 && i<=(n/4)*3 || 
						i==(n/4)*3 && j<=(n/4)*3 || i==j &&  i>=(n/4)*3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("      ");
			for(int j=0;j<n;j++) {
				if(i==0 && i+j<=(n/4)*3 && j!=0 && j!=(n/4)*3 || j==0 && i<=(n/4)*3 && i!=0 && i!=(n/4)*3 ||
						j==(n/4)*3 && i<=(n/4)*3 && i!=(n/4)*3 || 
						i==(n/4)*3 && j<=(n/4)*3 && j!=(n/4)*3 || i==j &&  i>=(n/4)*3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}

	}

}
