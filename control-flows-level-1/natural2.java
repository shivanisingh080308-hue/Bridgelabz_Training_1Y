//find natural number print natural number and find sum of natural number.
import java.util.Scanner;
class natural2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=sc.nextInt();
		if(a>0){
			System.out.println(" number is natural:");
		}
		while(n>0){
			int sum=n*(n+1)/2;
			System.out.println("  sum of number:"+sum);
		}
	}
}	
			
