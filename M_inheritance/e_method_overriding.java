package M_inheritance;
class Vehicle{
    void work(){
        System.out.println("Lets start vehicle");
    }
}
class Bike extends Vehicle{
    void work(){
        System.out.println("Bike start by self or kick!");
    }
}
class Car extends Vehicle{
    void work(){
        System.out.println("Car start by auto start!");
    }
}
public class e_method_overriding {
    public static void main(String[] args) {
        Vehicle v1=new Bike();
        v1.work();
        Vehicle v2 =new Car();
        v2.work();

    }
    
}
