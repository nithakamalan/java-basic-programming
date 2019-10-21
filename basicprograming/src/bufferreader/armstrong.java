package bufferreader;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;


public class armstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number"); 
		int a=Integer.parseInt(Br.readLine());
		

		int b=a;
		int r;
		int c=a;
		int count=0;
		int sum=0;
	
		while(c!=0);
		{
			count++;
			c=c/10;
		}while(a!=0) {
			
			r=a%10;
			sum=(int)(sum+Math.pow(r,count));
			a=a/10;
		}
		
		System.out.println(sum); 
		if(sum==b)
		System.out.println("armstrong");
		else
			System.out.println("not");
		
			
		}
			

	}


