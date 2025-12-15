package B_Object;

class std{
    int roll,age;
    String name,address;

    void inputdetails(int r,int a,String na,String ad){
        roll=r;
        age=a;
        name=na;
        address=ad;
    }
    void displaydetails(){
        System.out.println("\nRoll number:"+roll);
        System.out.println("Age:"+age);
        System.out.println("Name:"+name );
        System.out.println("Address:"+address);
    }
}
public class d_student_details {
    public static void main(String[] args) {
        std s1=new std();
        s1.inputdetails(420, 20, "hari", "Ramechhapoe");
        s1.displaydetails();
    }
    
}
