package J_this_keyword;

public class a_this {
    int id;
    String name;

    a_this(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
    }
    public static void main(String[] args) {
        a_this obj=new a_this(101, "Rabi");
        obj.display();
    }
}
