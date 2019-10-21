package bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dowhile {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		int a;
		do
		{
		System.out.println("enter the integer"); 
		 a=Integer.parseInt(Br.readLine());
		if(a>0)
			
		{
			sum=sum+a;
			
		}
		
		
		}	
		while(a>0);
		
		System.out.println(sum);

	}

	}
