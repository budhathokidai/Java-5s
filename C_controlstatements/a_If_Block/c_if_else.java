package C_controlstatements.a_If_Block;
import java.util.Scanner;
public class c_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* System.out.println("Enter the age :");
        int age=sc.nextInt();
        if(age>18)
        {
            System.out.println("Your are eligible to vote!");
        }
        else
        {
            System.out.println("You are not eligible to vote,come back next year!");
        } */
        System.out.println("Enter a number to check:");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }
        sc.close();
    }
    
}
