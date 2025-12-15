package D_Operators;
import java.lang.Math;
import java.util.Scanner;
public class a_arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        sc.close();
        System.out.println("The sum=" +(a+b));
        System.out.println("The Difference=" +(a-b));
        System.out.println("The Product=" +(a*b));
        System.out.println("The quotient=" +(a/b));
        System.out.println("The reminder=" +(a%b));
        System.out.println("The exponenetial=" +(int)Math.pow(a,b));
    }
}
