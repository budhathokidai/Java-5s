package E_class_task;
import java.util.Scanner;

public class f_reverse {
    public static void main(String[] args) {
        int num;
        int r=0;
        int digit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a number you want to reverse:" );
        num=sc.nextInt();
        while(num!=0)
        {
            digit=num%10;
            r=r*10+digit;
            num=num/10;
        }
        System.out.println("The reversed value is"+r);
        sc.close();
    }
    
}
