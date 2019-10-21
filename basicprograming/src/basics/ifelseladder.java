package basics;
import java.util.Scanner;
public class ifelseladder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the time taken");
		 int time=s.nextInt();
		
	if( time==1)
	{ 
		System.out.println("gold");
	}
	else if(time==2)
	{
		System.out.println(" silver");	
	}
	else if(time==3)
	{
		System.out.println(" copper");	
	}
		else
			
		{
			System.out.println(" disqualified");
		}
	}

}
