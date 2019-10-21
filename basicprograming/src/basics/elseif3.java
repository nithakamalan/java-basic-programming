package basics;
import java.util.Scanner;
public class elseif3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the battery percentage");
		 int percentage=s.nextInt();
		
	if( percentage>=19)
	{ 
		System.out.println("not charging");
	}
	else
	{
		System.out.println(" plse plug in");	
	}
	}
}
