package Assignmeny14;

public class Question5 {
    public void utilityMethods(){
        int a=Integer.parseInt("123");
        double b=Double.parseDouble("3.14");
        boolean c=Boolean.parseBoolean("true");
        String d=Integer.toBinaryString(10);
        boolean e=Character.isDigit('5');
        char f=Character.toUpperCase('a');
        System.out.println("Integer.parseInt : "+a);
        System.out.println("Double.parseDouble : "+b);
        System.out.println("Boolean.parseBoolean : "+c);
        System.out.println("Integer.toBinaryString : "+d);
        System.out.println("Character.isDigit : "+e);
        System.out.println("Character.toUpperCase : "+f);
    }
    public void main(String[] args){
        Question5 q5=new Question5();
        q5.utilityMethods();
    }
}
