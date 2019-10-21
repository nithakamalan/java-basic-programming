package controlstructure;

import java.util.Scanner;

public class controlstructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	
		int a=0;
		int b=1;
		System.out.printf(" %d ",a,b);
		for(int i=0;i<10;i++)
		{
			int c=a+b;
			System.out.printf(" %d ",c);
			a=b;
			b=c;
		}

		

	}

}
