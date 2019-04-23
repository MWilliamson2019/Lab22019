import java.util.Scanner;

public class Perimeter {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Enter the length of the side of the classroom: ");
	
	double area = scanner.nextDouble();
	double perimeter = 4*area;
	
	
	System.out.println("The area of the classroom is: " + area);
	System.out.println("The perimeter of the classroom is: " + perimeter);
	
	System.out.println("\nDo you want to continue enter (Y/N): ");

	
	System.out.println("The length of the classroom is: " + perimeter);
	System.out.println("The width of the classroom is: " + area);
	
	}

}
