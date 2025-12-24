package I_Constructor;
import java.util.Scanner;

class student {
    int age, roll, ph_number;
    String name, address;

    // CONSTRUCTOR
    student(int a, int r, int no, String naam, String add) {
        age = a;
        roll = r;
        ph_number = no;
        name = naam;
        address = add;
    }

    void display() {
        System.out.println("Age = " + age);
        System.out.println("Roll = " + roll);
        System.out.println("Phone number = " + ph_number);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
        System.out.println("------------------");
    }
}

public class a_stu_details {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student 1
        System.out.println("Enter details of Student 1:");
        student s1 = new student(
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.next(),
            sc.next()
        );

        // Student 2
        System.out.println("Enter details of Student 2:");
        student s2 = new student(
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.next(),
            sc.next()
        );

        // Display
        s1.display();
        s2.display();
        sc.close();
    }
}
