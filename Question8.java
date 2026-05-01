package Assignmeny14;
import java.util.Scanner;
public class Question8 {
    public void characterWrapper(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int letters=0;
        int digits=0;
        int special=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                letters++;
            }
            else if(Character.isDigit(s.charAt(i))){
                digits++;
            }
            else if(Character.isWhitespace(s.charAt(i))){
                special++;
            }
        }
        System.out.println("Total Letters : "+letters);
        System.out.println("Total Digits : "+digits);
        System.out.println("Total Special Characters :"+special);
    }

    public static void main(String[] args){
        Question8 q8=new Question8();
        q8.characterWrapper();
    }
}
