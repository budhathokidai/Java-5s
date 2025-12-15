package F_data_types;

public class q_array_sum_foreach {
    public static void main(String[] args) {
        int sum=0;
        int marks[]= {2,3,4,3,34,44,3};
        for (int mark : marks) {
            sum=sum+mark;  //sum=sum+mark    
        }
        System.out.println("The sum of marks:"+sum);
    }
}
