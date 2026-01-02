package N_Polymorphism_Abstract;
class Hero{
    void ho(){
        System.out.println("I am hero");
    }
}
class Honda extends Hero{
    //override
    void ho(){
        System.out.println("I am from hero");
    }
}
public class a_runtime_poly {
    public static void main(String[] args) {
        Hero a=new Honda();
        a.ho();
    }
    
}
