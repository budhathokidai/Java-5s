package L_inner_class;

class outer{
    int a=100;

class inner{
    String name="Hari";

class inner_2{
    int b=234567890;
}
}
}
public class b_nested_class {
    public static void main(String[] args) {
        outer o=new outer();
        outer .inner i=o.new inner();
        outer.inner.inner_2 r= i.new inner_2();
        System.out.println(o.a+ "" +i.name+""+r.b);
    }
}


