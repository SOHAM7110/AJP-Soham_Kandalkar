import java.util.Scanner;

public class l_array {
    static Scanner sc  = new Scanner(System.in);
    
    public static void main(){
        System.out.println("Enter the limit of Array : ");
        int limit = sc.nextInt();
        
        int num[] = new int[limit];
        float avg = 0;

        for (int i = 0; i < limit; i++){
            System.out.println("Enter the number at index " + i + " : ");
            num[i] = sc.nextInt();
            avg = avg + num[i];
        }
        avg = avg / limit;
        System.out.println("Average : " + avg);
    }
}
