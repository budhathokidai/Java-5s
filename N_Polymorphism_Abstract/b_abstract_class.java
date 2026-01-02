package N_Polymorphism_Abstract;
abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
public class b_abstract_class {
    public static void main(String[] args) {
        Bank b;   //defining like this make it global (means can be used for multiple method with one object)
        b=new SBI();
        System.out.println("Rate of intrest :" +b.getRateOfInterest()+"%");
        b=new PNB();
        System.out.println("Rate of intrest :" +b.getRateOfInterest()+"%");
    }
    
}
