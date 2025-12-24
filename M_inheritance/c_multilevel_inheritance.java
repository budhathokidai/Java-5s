package M_inheritance;
class Employee{
    void emp(){
        System.out.println("Employee belong to company!");
    }
}
class Programmer extends Employee{
    void pro(){
        System.out.println("Programmer belong to employee!");
    }
}
class Developer extends Programmer{
    void dev(){
        System.out.println("Developer belong to programmer!");
    }
}
public class c_multilevel_inheritance {
    public static void main(String[] args) {
        Developer d1=new Developer();
        d1.dev();
        d1.pro();
        d1.emp();
    }  
}
