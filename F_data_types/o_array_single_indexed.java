package F_data_types;

public class o_array_single_indexed {
    public static void main(String[] args) {
        int stu_marks[];
        stu_marks =new int[5];
        //int stu_marks=new int[5];  anothr way to definr
        //int[] stu_marks=new {23,4,3,4,5,4,5};  another way to get value
        stu_marks[0]=69;
        stu_marks[1]=49;
        stu_marks[2]=59;
        stu_marks[3]=79;
        stu_marks[4]=9;
        System.out.println(stu_marks[2]); //59
        System.out.println(stu_marks[1]); //49
        System.out.println(stu_marks[22]); ///error
    } 
}
