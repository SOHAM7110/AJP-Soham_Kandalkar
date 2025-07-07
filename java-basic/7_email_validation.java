import java.util.Scanner;

class e_EmailValidation{
    static Scanner sc = new Scanner(System.in);

    public static void validate_email(String email){
        if (email.contains("@")){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid email");
        }
    }

    public static void main(String[] agrs){
        System.out.println("Enter you email : ");
        String email = sc.nextLine();   //eg : sohamkandalkar7110@gmail.com
        validate_email(email);
    }

}
