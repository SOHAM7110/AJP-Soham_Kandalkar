import java.util.Scanner;

public class i_functions_and_method_2 {
    static float result = 0;
    static Scanner sc = new Scanner(System.in);

    public static void addition(){
        System.out.println("enter value of a and b : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        result = a + b;
        System.out.println("Sum = " + result);
    }
    
    public static void substraction(){
        System.out.println("enter value of a and b : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        result = a - b;
        System.out.println("Sum = " + result);
    }

    public static float multiplication(){
        System.out.println("enter value of a and b : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        return a * b;        
    }

    public static float division(float a, float b){
        return a / b;
    }
    public static void main(String[] args) {
		int choice = 0;
		do {
		
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
            switch(choice) {
			
			case 1:
				addition();
				break;
				
			case 2:
				substraction();
				break;
				
			case 3:
				System.out.println(multiplication());
				break;
				
			case 4:
                System.out.println("Enter the values of divident and divisor : ");
                float a = sc.nextFloat();
                float b = sc.nextFloat();
				System.out.println(division(a, b));
				break;
				
			default:
				System.out.println("Invalid choice");
			}
			
			choice = choice + 1;
		}while(choice <= 4);
		
	}
}
