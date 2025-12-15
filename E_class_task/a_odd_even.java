package E_class_task;
import java.util.Scanner;
public class a_odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System .in);
        System.out.println("Enter a number to check:");
        int a=sc.nextInt();
        if ((a%2==0)) {
            System.out.println("The entered number is even!");            
        }
        else
        {
            System.out.println("Then entered number is odd!");
        }
        sc.close();
    }
    
}
