package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class array2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b[]=new int[a];
		int s=0;
		int s1=0;
		int c=0;
		int d=0;
		System.out.println("enter the elements to first array");
		
		for(int i=0;i<a;i++)
		{
			b[i]=Integer.parseInt(br.readLine());
			
		}
		for(int i=0;i<a;i++)
		{
			if(b[i]%2==0)
			{
				s=s+b[i];
				c++;
			}
		}for(int i=0;i<a;i++)
				
				
			{
			if(b[i]%2!=0) {
				s1=s1+b[i];
				d++;}
			}
		
		float e=5/c;
		float f=s1/d;
		System.out.println("average of odd nos"+e);
		System.out.println("average of odd nos"+f);
		
		
			}
			
				

	}
	

