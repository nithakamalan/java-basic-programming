package basics;
import java.util.Scanner;
public class elseladder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the time mark");
		 int m=s.nextInt();
		
	if( m>=90 && m<=100)
	{ 
		System.out.println("A grade");
	}
	else if( m>=70 && m<=89);
	{
		System.out.println(" B grade");
	}
	
	else if( m>=50 && m<=69);
	{
		System.out.println(" c grade");
	}
		else
			
		{
			System.out.println(" fail");
		}
	}



	}


