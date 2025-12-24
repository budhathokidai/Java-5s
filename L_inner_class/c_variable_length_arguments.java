package L_inner_class;

class test{
    static void add(int... numbers){
        int sum=0;
        for(int n:numbers){
            sum =sum+n;
        }
        System.out.println("SUM=" +sum);
    }
}
public class c_variable_length_arguments {
    public static void main(String[] args) {
    test.add(10,20);
    test.add(1,2,3,33);
    test.add();
        
    }
   
    
}
