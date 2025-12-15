package F_data_types;

public class s_array_teo_dimension_accessing_single_element {
    public static void main(String[] args) {
        int[][] my_Array={
            {2,3,5},       //2*3
            {43,4,6}
        };
        //sccessing all element of array
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                 System.out.println(my_Array[i][j]+"");
            }
            System.out.println();
        } 
    }
}
