package E_class_task;
import java.util.Scanner;
public class g_reverse_with_obj {
    void reverse_number(int num)
    {
        int r=0;
        int digit;

        while(num!=0){
            digit =num%10;
            r=r*10+digit;
            num=num/10;
        }
        System.out.println("The reverse of a number is:"+r);
    }
    
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter a number to be swapped:");
        int num=sc.nextInt();
        g_reverse_with_obj obj=new g_reverse_with_obj();
        obj.reverse_number(num);
        sc.close();

    }
    
}
