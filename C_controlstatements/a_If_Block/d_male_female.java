package C_controlstatements.a_If_Block;
import java.util.Scanner;
public class d_male_female {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the gender you want to check:");
        char g=sc.next().charAt(0);
        if(g=='m')
        {
        System.out.println("Hello didi kata hidkeo?");
        }
        else{
            System.out.println("Hello uncle kata ho?");
        }
        sc.close();
    }
    
}
