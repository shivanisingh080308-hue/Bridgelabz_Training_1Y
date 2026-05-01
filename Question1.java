package Assignmeny14;
import java.util.Scanner;
public class Question1 {
    public void primitiveToWrapper(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an integer");
        int a=s.nextInt();
        Integer b;
        b=a;
        System.out.println("Primitive Datatype : "+a);
        System.out.println("Integer object : "+b);
    }
    public static void main(String[] args){
        Question1 q1=new Question1();
        q1.primitiveToWrapper();
    }
}
