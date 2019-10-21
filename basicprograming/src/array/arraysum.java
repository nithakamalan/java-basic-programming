package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraysum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b[]=new int[a];
		int c[]=new int[a];
		int s[]=new int[a];
		System.out.println("enter the elements to first array");
		
		for(int i=0;i<a;i++)
		{
			b[i]=Integer.parseInt(br.readLine());
			
		}
		System.out.println("enter the elements to second array"); 
		for(int i=0;i<a;i++)
		{
			c[i]=Integer.parseInt(br.readLine());
				

	}
		for(int i=0;i<a;i++)
		{
			System.out.println(c[i]+b[i]);
		}
	}
}
