package E_class_task;
import java.util.Scanner;
public class d_class_task {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the Third number:");
        int c=sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("a is the greatest among three numbers.");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is greaterst among the three numbers.");
        }
        else
        {
            System.out.println("c is greatest among three numbers.");
        }
        sc.close();
    }
}
