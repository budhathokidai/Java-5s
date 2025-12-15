package C_controlstatements.a_If_Block;
import java.util.Scanner;
public class b_nested_if {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num<100)
        {
            if(num<40)
            {
                System.out.println("The numer" + num + "is less than 40");
            }
            if(num==40)
            {
                System.out.println("The numbe" + num + "is equal to 40");
            }
        }
        sc.close();
    }
    
}
