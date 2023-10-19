package JavaConcepts;

public class vowelsCount {

	public static void main(String[] args) {
		String str=new String("This is a string to check vowels.");
		char ch;
		int a=0,e=0,i=0,o=0,u=0;
		
		for(int j=0;j<str.length();j++)
		{
			
			ch=str.toLowerCase().charAt(j);
			
			switch(ch)
			{
			case'a':a++;
				break;
			case'e':e++;
				break;
			case'i':i++;
				break;
			case'o':o++;
				break;
			case'u':u++;
				break;
					
			}
			
		}
		System.out.println("a : "+a+"\ne : "+e+"\ni : "+i+"\no : "+o+"\nu : "+u);
	}

}
