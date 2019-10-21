package switchstatement;

import java.util.Scanner;

public class nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int collegeyear=s.nextInt();
		char branch=s.next().charAt(0);
		
		switch(collegeyear){
			case 1:
				System.out.println("english,maths,science");
		break;
		case 2:
			switch( branch)
			
{
	case 'c':
		System.out.println("microprocessors,logic switch theory");
		break;
	case 'e':
		System.out.println("microprocessors,logic switch theory");
		break;

		case 'm':
			System.out.println("drawing manufacturing machines");
			break;
		default:
			System.out.println("invalid");
			break;
}
		case 3:
		switch(branch)
		{
		case 'c':
			System.out.println("computer borganisation,multimedia");
			break;
		case 'e':
			System.out.println("fundamentals of logic design,microelectronics");
			break;
			case 'm':
				System.out.println("internal combustion engine,mechanical vibration");
				break;
			default:
				System.out.println("invalid");
				break;
			case 4:
				switch(branch)
				{
				case 'c':
					System.out.println("data communication and networks,multimedia");
					break;
				case 'e':
					System.out.println("embeded system,image processing");
					break;
					case 'm':
						System.out.println("production technology,thermal engineering");
						break;
						default:
							System.out.println("invalid");
							break;
				}
				break;
							
							
				}
		
}
		}

	private static Object Next() {
		// TODO Auto-generated method stub
		return null;
	}
		

	}

	