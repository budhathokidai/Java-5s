package F_data_types;

public class r_array_avarage_foreach {
    public static void main(String[] args) {
       int sum=0;
       int avg;
       int marks[]= {2,3,4,3,34,44,3};
        for (int mark : marks) {
            sum=sum+mark;  //sum=sum+mark
                
        }
         avg=sum/marks.length;  
        System.out.println("The sum of marks:"+sum);
        System.out.println("The average of marks:"+avg);
    }
}   

