package E_class_task;
import java.util.Scanner;
public class e_marks_of_student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks for every subjaect");
        float eng,nep,sci,web,java,total;
        System.out.println("Enter marks of english:");
        eng=sc.nextFloat();
        System.out.println("Enter marks of nepali:");
        nep=sc.nextFloat();
        System.out.println("Enter marks of science:");
        sci=sc.nextFloat();
        System.out.println("Enter marks of web:");
        web=sc.nextFloat();
        System.out.println("Enter marks of java:");
        java=sc.nextFloat();
        sc.close();
        total=eng+nep+sci+web+java;
        System.out.println("The toatal= " +total);    
    }
    
}
