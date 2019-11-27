package basics;
import java.util.Scanner;

public class strongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		 int n=s.nextInt();
		 int sum=0;
		 int r;
		 while(n!=0)
		 {
			int f=1;
		 
			 r=n%10;
			 for(int i=1;i<=r;i++)
			 {
				 f=f*i;
			 }
		sum=sum+f;
		n/=10;
		n=n/10;
		if(sum==n)
		 {
			 System.out.println("strong");
		 }
		 else 
		 {
			 System.out.println("notstrong");
		 }

	}}
}
	

