package controlstructure;

import java.util.Scanner;

public class forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=s.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
			
			

	}




	}


