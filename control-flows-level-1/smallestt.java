import java.util.Scanner;// first number is smallest of the three number;ex:2,4,6
class smallestt
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b&&a<c){
			System.out.println("a is smaller:"+a);
		}
		else{
			System.out.println("a is not smallest:"+a);
		}
	}
}
