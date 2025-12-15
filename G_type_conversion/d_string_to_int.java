package G_type_conversion;

public class d_string_to_int {
    public static void main(String[] args) {
        String str="1234";
        System.out.println("The string = " + str);
        int num_string = Integer.parseInt(str);
        System.out.println("Converted integer = " + num_string);
        int checkSum = 99;
        System.out.println("The concatenation " + (str + checkSum));
        System.out.println("The sum " + (num_string + checkSum));
    }
}
