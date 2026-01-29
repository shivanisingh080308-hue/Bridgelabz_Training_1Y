import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	    if (a>0){
			int sum=a*(a+1)/2;
			System.out.println("sum of numbers:"+sum);
	}
	else{
		System.out.println("Number is not natural");
}
}
}
		