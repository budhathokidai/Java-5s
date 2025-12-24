package M_inheritance;
class Employee{
    float salary=4000;
}
class programer extends Employee{
    int bonus=100;
}
public class a_inheritance {
    public static void main(String[] args) {
        programer p=new programer();
        System.out.println("Programer salary is:"+ p.salary);
        System.out.println("Programer bonous  is:"+p.bonus);
    }
    
}
