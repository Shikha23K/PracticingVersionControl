package JavaConcepts;
import java.util.Scanner;
public class Primeno {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		boolean flag=false;
		System.out.println("Please enter a numeric value rather than 0/1");
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
			if(n%i==0)
				{
				flag=true;
				break;
				}
		if(flag==true)
			System.out.println(n+" is not a prime no");
		else
			System.out.println(n+" is prime no");
	}

}
