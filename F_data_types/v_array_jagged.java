package F_data_types;

public class v_array_jagged {
    public static void main(String[] args) {
        int [][] Array={
            {23,4,5,3},
            {6,7,8}
        };
        System.out.println("\n");
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {    //bounded
                System.out.print(Array[i][j] + "    ");
            }
            System.out.println(); 
        }
    }
}
