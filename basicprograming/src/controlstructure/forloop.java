package controlstructure;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=0;
		int b=1;
		int m=0;
		int n=s.nextInt();
		for(int i=1;i<n;i++)
		{
			int c=a+b;
			if(c==m)
			{
				m++;
			
			}
			a=b;
			b=c;
			
		}
if(m!=0)
{
	System.out.printf("yes");
}
else

	
    System.out.printf("no");

	}

}
