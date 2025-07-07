package package1;

import java.util.Scanner;

public class TestDoWhileCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 0, num1, num2;
		
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		do {
		
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			
			System.out.println("Enter your choice : ");
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Addition called");
				System.out.println("Enter num1 : ");
				num1 = scan.nextInt();
				System.out.println("Enter num2 : ");
				num2 = scan.nextInt();
				result = num1 + num2;
				System.out.println("Addition result : " + result);
				break;
				
			case 2:
				System.out.println("Subtraction called");
				System.out.println("Enter num1 : ");
				num1 = scan.nextInt();
				System.out.println("Enter num2 : ");
				num2 = scan.nextInt();
				result = num1 - num2;
				System.out.println("Subtraction result : " + result);
				break;
				
			case 3:
				System.out.println("Multiplication called");
				System.out.println("Enter num1 : ");
				num1 = scan.nextInt();
				System.out.println("Enter num2 : ");
				num2 = scan.nextInt();
				result = num1 * num2;
				System.out.println("Multiplication result : " + result);
				break;
				
			case 4:
				System.out.println("Division called");
				System.out.println("Enter num1 : ");
				num1 = scan.nextInt();
				System.out.println("Enter num2 : ");
				num2 = scan.nextInt();
				result = num1 / num2;
				System.out.println("Division result : " + result);
				break;
				
			default:
				System.out.println("Invalid choice");
			}
			
			//choice = choice + 1;
		}while(choice != 4);
		
	}

}
