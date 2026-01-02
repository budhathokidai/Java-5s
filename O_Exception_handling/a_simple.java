package O_Exception_handling;
public class a_simple {
    public static void main(String[] args) {
        try{
            int a=20;
            int b=0;
            int result=a/b;
            System.out.println("The result is:"+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error:cannot be divided by zero!");
        }
        System.out.println("rest of the code");
    }  
}
