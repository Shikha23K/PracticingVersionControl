package JavaConcepts;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str;
		String rev="";
		System.out.println("Enter a word to check whether it is Palindrom or not ");
		str=sc.next();
		
		 
		for(int i=str.length()-1;i>=0;i--)
		
			rev=rev+str.toLowerCase().charAt(i);
			
		if(str.equals(rev))
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrom");
		
		sc.close();

	}

}
