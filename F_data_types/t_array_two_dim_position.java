package F_data_types;

public class t_array_two_dim_position {
    public static void main(String[] args) {
       /*  int [][]myarray=new int[][]{
            {2,4,3,4,6},
            {20,45,65,40,56,66}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
            System.out.println(myarray[i][j]);
            }
        } */

         int pos[][]=new int[4][5];
         int k=0;
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                pos[i][j]=k;
                k++;  
            }
         }
         System.out.println("");
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(pos[i][j]+ "       ");
            }
            System.out.println();
         }
    }
}
