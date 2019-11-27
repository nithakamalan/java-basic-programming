package programs;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");

		String n = s.nextLine();
		int length = n.length();
		int count=0;
		for(int i=0; i<length;i++)
		{
		  char ch = n.charAt(i);
		 
		 
		 
		  if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		  {
			  count++;
			  for(int j=0;j<count;j++)
			  {
				  System.out.print("*");  
			  }
		 
		          System.out.print("c");
		          for(int j=0;j<count;j++)
				  {
					  System.out.print("*");  
				  }
			 
			          System.out.print("c");
		          
		  }
		 
		 
		 
		 
		}






		}

		}

		
