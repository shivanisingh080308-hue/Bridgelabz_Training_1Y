package Assignmeny14;

import java.util.ArrayList;

public class Question7 {
    public void doubleToDouble(){
        double[] prices={10.5,20.0,35.75,5.5};
        ArrayList<Double> list=new ArrayList<>();
        for(int i=0;i<prices.length;i++){
            Double t=prices[i];
            list.add(t);
        }
        double max=list.get(0);
        for(double n : list){
            if(n>max){
                max=n;
            }
        }
        double sum=0;
        for(Double n : list){
            sum+=n;
        }
        double avgprice=sum/list.size();
        System.out.println("Double object list : "+list);
        System.out.println("Highest Price : "+max);
        System.out.println("Average Price : "+avgprice);
    }

    public static void main(String[] args){
        Question7 q7=new Question7();
        q7.doubleToDouble();
    }
}
