package basics;
import java.util.Scanner;
public class lcm 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		for(int j=0;j<10;j++)
		{
		System.out.println("enter the number");
		 int a=s.nextInt();
		 int b=s.nextInt();
			System.out.println("1)HCF\n2)LCM");
		 int choice=s.nextInt();
		 int gcd=0,lcm;
			 int min=(a<b)?b:a;
			 int max=(a<b)?b:a;
			 switch(choice)
			 {
			 case 1:
				 for(int i=min;i>0;i--)
				 { 
					 if(a%i==0&&b%i==0) 
					 {
						 gcd=i;
						 break;
					 }
				 }
			 System.out.println(gcd);
			 break;
			 case 2:
				 for(int i=max;;i++)
				 {
					 if(i%a==0&&i%b==0) 
					 {	 lcm=i;
					 break;
					 }
				 }
					 System.out.println(lcm);
					 break;
					 
				 }
				 
				 }
		s.close();
	}
}