package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int m=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of the array");
		
		int size=Integer.parseInt(br.readLine());
		int a[]=new int[size];
		System.out.println("enter the size of the array");
		for(int i=0;i<size;i++)
		{
		 a[i]=Integer.parseInt(br.readLine());
	}
	for(int i=0;i<size;i++)
	{
		
			if(a[i]>=m)
			{
				m=a[i];
			}
	}
	
		System.out.println(m);

	}

}
