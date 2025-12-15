package C_controlstatements.a_If_Block;
import java.util.Scanner;
public class e_greatest_among_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of r:");
        int r=sc.nextInt();
        System.out.println("Enter the value of a:");
         int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        if(r>b && r>a)
        {
            System.out.println("The number " + r + " is the gretaest among three");
        }
        else if(a>r && a>b)
        {
            System.out.println("The number " + a + " is the gretaest among three");
        }
        else
        {
            System.out.println("The numeber " + b + " is the gretaest among three");
        }
        sc.close();
    }
    
}
