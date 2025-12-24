package I_Constructor;

class Stu_dent{
    int id;
    String name;
    int age;

    Stu_dent(int i,String na,int a){
        id=i;
        name=na;
        age=a;
    }
    void display()
    {
        System.out.println("Student details:"+" "+id+ " " +name+ " " +age);
       
    }
}
public class b_example {
    public static void main(String[] args) {
        Stu_dent s1=new Stu_dent(2,"rabi", 30);
        Stu_dent s2=new Stu_dent(3, "Kabi", 30);
        s1.display();;
        s2.display();
    }
    
}
