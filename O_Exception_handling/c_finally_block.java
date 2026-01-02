package O_Exception_handling;

public class c_finally_block {
    public static void main(String[] args) {
        try{
            System.out.println("inside the try class");
            int data=25/5;
            System.out.println(data);
        }
        catch(NullPointerException e){
            System.out.println(e);

        }
        finally{
            System.out.println("Finally block is always excuted");

        }
        System.out.println("Rest of the code...");
        
    }
    
}
