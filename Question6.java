package Assignmeny14;

public class Question6 {
    public static int safeParseInt(String input){
        try {
            int ans = Integer.parseInt(input);
            return ans;
        }
        catch(NumberFormatException e){
            return -1;
        }
    }

    public static void main(String[] args){
        String[] s={"123","abc","45.6","0"};
        for(int i=0;i<s.length;i++){
            int res=safeParseInt(s[i]);
            System.out.println("Result of input "+s[i]+" is : "+res);
        }
    }
}
