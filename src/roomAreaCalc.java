import java.util.InputMismatchException;
import java.util.Scanner;

public class roomAreaCalc {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		String input = "";
		float length, width, height;
		double area, perim, volume;
		
		do {
			System.out.print("Enter Length: ");
			length = sc.nextFloat();

			System.out.print("Enter Width: ");
			width = sc.nextFloat();
			
			System.out.print("Enter Height: ");
			height = sc.nextFloat();
			
			area = length * width;
			perim = ((length * 2) + (width * 2));
			volume = (length * width * height);
			
			System.out.println("Area: " + area);
			System.out.println("Permiter: " + perim);
			System.out.println("Volume: " + volume);

			System.out.print("Continue? (y/n): ");
			input = sc.next();

			} while (input.equalsIgnoreCase("Y"));

		System.out.println("Goodbye!");
		
		sc.close();
		
		
		}	
}