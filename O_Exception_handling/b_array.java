package O_Exception_handling;

public class b_array {
    public static void main(String[] args) {
        try{
            int arr[]={1,3,5,7};
            System.out.println(arr[10]);
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+e);
        }

        System.out.println("Program continues normally");
    }
    
}
