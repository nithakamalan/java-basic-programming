package basics;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER");
		char a=s.next().charAt(0);
		int n=s.nextInt();
        s.nextLine();
		String s1=s.nextLine();
		int n1=s.nextInt();
		System.out.printf("%-15s,%03d\n",a,n);
		System.out.printf("%-15s,%03d\n",s1,n1);
		

	}

}
