package L_inner_class;

class outer{
    int a=100;

class inner{
    String name="Hari";
}
}
public class a_inner_class {
    public static void main(String[] args) {
        outer o=new outer();
        outer.inner i = o.new inner();
        System.out.println(o.a +" "+ i.name);
    }
    
}
 