package B_Object;

class student{
    int roll=67;
    String name ="Hari";
}

public class c_class_outside_the_main_class {
    public static void main(String[] args) {
        student s1=new student();
        System.out.println("Roll number:" +s1.roll);
        System.out.println("Name:" +s1.name);
    }   
}
