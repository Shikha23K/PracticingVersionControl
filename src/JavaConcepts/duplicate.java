package JavaConcepts;

public class duplicate {

	public static void main(String[] args) {
		String str=new String("eeeeeiiiuuooo");
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
		if(a>0 )
			System.out.println("a is duplicated");
		if( e>0)
			System.out.println("e is duplicate");
		if( e>0)
			System.out.println("i is duplicate");
		
		if( o>0 )
			System.out.println("o is duplicate");
		if( u>0)
			System.out.println("u is duplicated");
	
	
	}

}
