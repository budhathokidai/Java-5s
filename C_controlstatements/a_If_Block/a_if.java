package C_controlstatements.a_If_Block;
import java.util.Scanner;

public class a_if {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("The number" + num + "is positive");
        }
        sc.close();
    }
    
}
