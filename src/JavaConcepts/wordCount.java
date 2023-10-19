package JavaConcepts;
import java.util.Scanner;

public class wordCount {

	public static void main(String[] args) {
		String str;		
		int count=0;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		str=sc.nextLine();
		
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=' ' || str.charAt(i)!='\n'&& str.charAt(i+1)!=' ' && flag==true)		
			{
				count++;
				flag=false;
			}
			if(str.charAt(i)==' ' || str.charAt(i)=='\n')
				flag=true;
		}	
	     
	 	System.out.println(count);

	}		
		
}
	/*String str="Let us  check the number of words in this sentence	WAP in java to count the number of words in the string*/

