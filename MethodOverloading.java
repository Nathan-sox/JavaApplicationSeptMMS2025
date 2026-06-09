import java.util.scanner
 
 
 public class MethodOverloading{
	public static void main (String[]args){
	Scanner scan = Scanner (system.in);
	System.out.printIn("=====Calculate Perimeter of Shape====");
	System.out.printIn("Enter 1. for Square");
	System.out.printIn("Enter 2. for Rectangle");
	System.out.printIn("Enter 3. for Triangle");
	System.out.printIn("Enter 4. Exist program");
	System.out.printIn("================================");
		
	System.out.printIn("Enter your choice");
	int choice = scan.nextInt();
	
	switch(choice)(
		case 1:+
			System.out.printIn("Enter the lenght of the square:  ");
			int lenOfSquare(lenOfSquare)
		break;
		
		case 2:
			System.out.printIn("Enter the width Of rectangle :  ");
			int lenOfRec= scan.nextInt();
			
		break;
		
		case 3:
			System.out.printIn("Enter sideA:  ");
			int sideA= scan.nextInt();
				
			System.out.printIn("Enter sideB:  ");
			int sideB= scan.nextInt();
			
			System.out.printIn("Enter sideC:  ");
			int sideC= scan.nextInt();
			
			perimeter(sideA,sideB,sideC);
			
		break;
		default:
					System.out.printIn("Program Existed , Good Bye......" );
			
		}	
	}
	
	public static void perimeter ( int LenOfSquare) {
		int perimeterof square = 4 * LenOfSquare;
		
		system.out.printf ("The perimeter of the square is %d%n",perimeterofsquare);
	}
}

	
	public static void perimeter (int lenofRec, int LenOf Width) {
		int perimeterof Rec= 2 *(lenOfRec + widthOfRec);
		
		system.out.printf ("The perimeter of the Rectangle is %d%n",perimeterofRec);
	}
}

	public static void perimeter (int sideA, int sideB, int sideC){
		int perimeterofTriangle = sideA + sideB + sideC;
		
		system.out.printf ("The perimeter of the triangle is %d%n",perimeterofTriangle);
	}
}