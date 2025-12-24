package M_inheritance;
class Animal{
    void eat()
    {
        System.out.println("Animal eats food");
    }
}
//bark inherits animal
class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog barks!");
    }
}
public class b_single_inheritance {
    public static void main(String[] args) {
        Dog b=new Dog();
        b.eat();
        b.bark();
        
    }
    
}
