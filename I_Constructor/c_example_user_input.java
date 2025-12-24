package I_Constructor;
import java.util.Scanner;
class Stuent{
    int id;
    String name;
    int age;

    Stuent(int i,String na,int a){
        id=i;
        name=na;
        age=a;
    }
    void display()
    {
        System.out.println("The student id:" +id);
        System.out.println("The student name:" +name);
        System.out.println("The student age:" +age);
        System.out.println();
       
    }
}
public class c_example_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Details of student one:");
        Stuent s1=new Stuent(
            sc.nextInt(),
            sc.next(),
            sc.nextInt()
        );
        System.out.println("Details of student two:");
        Stuent s2=new Stuent(
            sc.nextInt(),
            sc.next(),
            sc.nextInt()
        );
        s1.display();
        s2.display();
        sc.close();


    }
    
}
