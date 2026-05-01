package Assignmeny14;

public class Question2 {
    public void wrapperToPrimitive(){
        Double a=45.67;
        double c=a;
        int b=(int)(c);
        System.out.println("Double Object : "+a);
        System.out.println("Converted to Primitive Integer : "+b);
    }
    public static void main(String[] args){
        Question2 q2=new Question2();
        q2.wrapperToPrimitive();
    }
}
