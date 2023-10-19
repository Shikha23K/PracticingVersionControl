package JavaConcepts;

import java.util.Scanner;

public class LoopDemo1 {

	public static void main(String[] args) {
		int i=0;
		while(i<=5)
		{
//			System.out.println(i);
			i++;
		}
		
		for(int j=0;j<=8;j++)
		{
			System.out.println(j);
		}
		
		int k,f=1;
		System.out.println("nter a integer value :");
		Scanner s=new Scanner(System.in);
		k=s.nextInt();
		do
		{
			f*=k;
			k--;
			System.out.println(f);
			
		}while(k>=1);
	}

}
