package oopsconcept;
import java.util.Scanner;
public class Arthematicc {

	
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Number1");
			int a = s.nextInt();
			System.out.println("Enter the Number2");
			int b = s.nextInt();
			System.out.printf("1)add\n2)sub\n3)mul\n");
			int n = s.nextInt();
			Operation c = new Operation(a,b);
			switch(n)
			{
			case 1:
				Operation.add(a,b);
				break;
			case 2:
				Operation.sub(a,b);
				break;
			case 3:
				Operation.mul(a,b);
				break;
				
				
					
			
			}
			}
}
			class Operation{
			int a,b;
			public Operation(int a, int b) {
			a=a;
			b=b;
			}
			public static void add(int a,int b) {
			System.out.printf("Add-> %d",a+b);
			
			}
			public static void sub(int a,int b) {
				System.out.printf("Sub-> %d",a-b);
				
				}
			public static void mul(int a,int b) {
				System.out.printf("Mul-> %d",a*b);
				
				}
			
			}
		




	


