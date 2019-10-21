package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class arraybuffrer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		 int a=s.nextInt();
		String b[]=new String[a];
		System.out.println("enter the elements");

				for( int i=0;i<a;i++)
				{
					b[i]=s.next();
				}
				char c;
				for( int i=0;i<a;i++)
				{
					c=b[i].charAt(0);
					if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
						System.out.println(b[i]);	
				}
				
	}

	}}
