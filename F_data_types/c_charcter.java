package F_data_types;
import java.util.Scanner;
public class c_charcter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        char letter=sc.next().charAt(0);//r for ram
        System.out.println("The first letter is="+letter);
        System.out.println("ASCII value for letter" +letter+"is " +(int)letter);

      /*   char leter ='a';
        int ascii_num = letter;
        System.out.println("The ascii value for letter"+ leter+ "is"+ascii_num); */
        sc.close();
    }
    
}
