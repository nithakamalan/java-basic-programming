package basics;
import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		 int size=s.nextInt();
		
	if(size<=6)
	{ 
		System.out.println("dowmload");
	}
	else
	{
		System.out.println("insuffient space");	
	}
	}
}
