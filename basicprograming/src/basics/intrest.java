package basics;
import java.util.Scanner;
public class intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int p=s.nextInt();
		int n=s.nextInt();
		float r=s.nextFloat();
		float i=p*n*r/100;
		System.out.printf("intrst %2f=",+i);
	

	}

}
