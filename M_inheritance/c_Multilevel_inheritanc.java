package M_inheritance;
class Employ{
    void emp(){
        System.out.println("Employee belong to company!");
    }
}
class Programm extends Employ{
    void pro(){
        System.out.println("Programmer belong to employee!");
    }
}
class Developer extends Programm{
    void dev(){
        System.out.println("Developer belong to programmer!");
    }
}

public class c_Multilevel_inheritanc {
    public static void main(String[] args) {
        Developer d1=new Developer();
        d1.dev();
        d1.pro();
        d1.emp();
    }  
}
