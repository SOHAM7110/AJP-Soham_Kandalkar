import java.util.*;

class f_scanner {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Welcom " + name + ", age = " + age);
    }

}
