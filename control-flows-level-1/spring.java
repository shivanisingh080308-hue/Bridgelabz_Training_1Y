import java.util.Scanner;
class spring
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();// month
	int d=sc.nextInt();// day
	if((m==3&&d>19)||(m==4)||(m==5)||(m==6&&d<21)){
		System.out.println("spring season:");
	}
	else{
		System.out.println("not spring season:");
	}
	}
}