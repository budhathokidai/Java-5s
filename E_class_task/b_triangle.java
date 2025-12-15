package E_class_task;
import java.util.Scanner;
public class b_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first side BC:");
        int a=sc.nextInt();
        System.out.println("Enter first side AC :");
        int b=sc.nextInt();
         System.out.println("Enter first side AB:");
        int c=sc.nextInt();
        
        if(a==b && b==c)
        {
            System.out.println("Equilateral triangle!");
        }
        else if((a==b || b==c || a==c))
        {
            System.out.println("Iso triangle!");
        }
        else
        {
            System.out.println("Scalen triangle!");
        }
        sc.close();
    }   
}
