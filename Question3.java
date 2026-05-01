package Assignmeny14;
import java.util.ArrayList;
import java.util.List;
public class Question3 {
    public void autoUnboxing(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List : "+list);
        int sum=0;
        for(Integer n : list){
            sum+=n;
        }
        System.out.println("Sum : "+sum);
    }
    public static void main(String[] args){
        Question3 q3=new Question3();
        q3.autoUnboxing();
    }
}
