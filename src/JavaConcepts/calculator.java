package JavaConcepts;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m;
		float result=0.0f;
		char operator,ch;
		
		System.out.println("Please enter two numeric value ");
		n=sc.nextInt();
		m=sc.nextInt();
		do
		{
			
			System.out.println("Enter the operator symbol ");
			operator=sc.next().charAt(0);
			switch(operator)
			{
				case '+':result =n+m;
					break;
				case '-':result=n-m;
					break;
				case '/': result=n/m;
					break;
				case '*': result=n/m;
				break;
			
				case '%': result=n%m;
					break;
				default: System.out.println("Enter only '+' '-' '/' '%' '*' ");
				
			}
			System.out.println("Result is : "+result);
			System.out.println("Enter your choice y/n");
			ch=sc.next().charAt(0);
			}while(ch!='n');
		sc.close();
	}

}
