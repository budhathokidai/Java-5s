package M_inheritance;
class Teacher{
    void work(){
        System.out.println("Teaches Subject in school!");
    }
}
class Mathteacher extends Teacher{
    void equ(){
        System.out.println("Teaches Mathematics");
    }
}
class Scienceteacher extends Teacher{
    void physics(){
        System.out.println("Teaches Science(Physics)");
    }
}
public class d_hierarchical_inheritance {
    public static void main(String[] args) {
        Scienceteacher s=new Scienceteacher();
        s.work();
        s.physics();
        Mathteacher m=new Mathteacher();
        m.work();
        m.equ();   
    }
    
}
