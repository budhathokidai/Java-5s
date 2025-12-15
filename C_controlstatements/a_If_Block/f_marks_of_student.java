package C_controlstatements.a_If_Block;
import java.util.Scanner;
public class f_marks_of_student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks less tahn 100:");
        double eng,nep,math,sci,comp,total,per;
        System.out.println("Enter the marks in english:");
        eng=sc.nextDouble();
        System.out.println("Enter the marks in nepali:");
        nep=sc.nextDouble();
        System.out.println("Enter the marks in math:");
        math=sc.nextDouble();
        System.out.println("Enter the marks in science:");
        sci=sc.nextDouble();
        System.out.println("Enter the marks in computer:");
        comp=sc.nextDouble();
        sc.close();

        total=eng+nep+math+sci+comp;
        System.out.println("The total is: "+total);

        if(eng> 35 && nep>35 && math>35 && sci>35 && comp>35){
            per=total/5;
        System.out.println("The percentage:" +per);

        if(per>=90)
        {
            System.out.println("Distinction");
        }
        if(per>=80)
        {
            System.out.println("First division!");
        }
        if(per>=45)
        {
            System.out.println("Second division!");
        }
        if(per>=32)
        {
            System.out.println("Third division!");
        }
        }
        else{
            System.out.println("Better luck next time!");
        }   
    }  
}
