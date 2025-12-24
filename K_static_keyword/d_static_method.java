package K_static_keyword;
class College{
    int roll;
    String name;
    static String college="IIT";

    static void change()
    {
        college="BICTE";
    }

    College(int r,String n)
    {
        roll=r;
        name=n;
    }
    void dispaly()
    {
        System.out.println("Roll no="+roll);
        System.out.println("Name="+name);
        System.out.println("College name="+college);
    }
}

public class d_static_method {
    public static void main(String[] args) {
        College.change();
        College s1=new College(223, "Bread");
        College s2=new College(23, "jam");
        s1.dispaly();
        s2.dispaly();
        
    }
    
}
