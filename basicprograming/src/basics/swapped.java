package basics;
import java.util.Scanner;
public class swapped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
	
		int t;
		t=a;
		
		
		a=b;
		b=t;
		System.out.println("a="+a);
		System.out.println("b="+b);


	}

}
