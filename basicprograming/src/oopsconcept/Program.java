package oopsconcept;
import java.util.Scanner;
public class Program {

	
		public static void main(String args[])
		  {
		    Scanner s=new Scanner(System.in);
		    System.out.println("");
		    int n=s.nextInt();
		    System.out.println("Enter the name");
		    String name=s.next();
		    System.out.println("Enter the address");
		    String addr=s.next();
		    System.out.println("Enter the contact number");
		    String num=s.next();
		    System.out.println("Enter the email");
		    String email=s.next();
		    System.out.println("Enter the ProofType");
		    String proof=s.next();
		    System.out.println("Enter the proof ID");
		    String proofid=s.next();
		    System.out.println("Registration Successfull");
		    customer c=new customer(n,name,addr,num,email,proof,proofid);
		    c.register(n,name,addr,num,email,proof,proofid);
		  }
		}

		class customer{
		  int n;
		  String name;
		  String addr;
		  String num;
		  String email;
		  String proof;
		  String proofid;
		  public customer(int n,String name,String addr,String num,String email,String proof,String proofid)
		  {
		    this.n=n;
		    this.name=name;
		    this.addr=addr;
		    this.num=num;
		    this.email=email;
		    this.proof=proof;
		    this.proofid=proofid;
		  }
		  public static void register(int n,String name,String addr,String num,String email,String proof,String proofid)
		  {
		    System.out.println("Your Details:");
		    System.out.println(name);
		    System.out.println(addr);
		    System.out.println(num);
		    System.out.println(email);
		    System.out.println(proof);
		    System.out.println(proofid);
		    System.out.println("Your id is "+n);
		  }
		}


	}

}
