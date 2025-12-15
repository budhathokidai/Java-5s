package F_data_types;

public class w_array_single_dim_string {
    public static void main(String[] args) {
        String[] names={"Hello","Shyam","hira","tira","Jira","Kira","chira","Ram","Bye"};
        System.out.println(names[5]);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            

            /* for (String name : names) {
                System.out.println(name);
                
            } */
        }
    }
}
