import java.util.Scanner;
public class e_square_of_user_input_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number you want:");
        int a=sc.nextInt();
        int Square=a*a;
        System.out.println("Square of the given number:" +Square);
        sc.close();
    }
    
}
