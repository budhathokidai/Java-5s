package K_static_keyword;

class Stdn{
    int rollno;    //instance varible
    String name;        //instance variable
    static String college="IIT";  //static variable
    static int college_code=12345;   //static variable

    Stdn(int r ,String n){
        rollno=r;
        name=n;
    }
    void dispaly(){
        System.out.println("Roll no="+rollno);
        System.out.println("Name="+name);
        System.out.println("College = " + college);
        System.out.println("College Code = " + college_code);
        System.out.println("--------------------");
    }
}
