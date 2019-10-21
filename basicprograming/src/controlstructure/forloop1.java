package controlstructure;

import java.util.Scanner;

public class forloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=s.nextInt();
		for(int i=0;i<=4;i++) {
			for(int j=0;j<i;j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
			
			

	}

}
