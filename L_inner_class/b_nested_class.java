package L_inner_class;

class Outer {
    int a = 100;

    class Inner {
        String name = "Hari";

        class Inner_2 {
            int b = 234567890;
        }
    }
}
public class b_nested_class {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        Outer.Inner.Inner_2 r = i.new Inner_2();
        System.out.println(o.a + " " + i.name + " " + r.b);
    }
} 


