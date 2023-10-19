package JavaConcepts;

public class StringBuf {

	public static void main(String[] args) {
		String str="MADAN";
		StringBuffer name=new StringBuffer(str);
		
		String rev=new String(name.reverse());
		System.out.println(rev);	
		
		if(str.equals(rev)==true)
			System.out.println("It is palindrom ");
		else
			System.out.println("It is not palindrom ");
	/*	
		StringBuffer fullName;
		fullName=name.append("Gupta");//append
		System.out.println("Full name is : "+fullName);
		int len=name.length();
		System.out.println("Length : "+len);
		
		fullName=fullName.insert(fullName.indexOf("r")+1,' ');//insert &  indexOf
		System.out.println(fullName);
		
		fullName.delete(8, 12);//delete
		System.out.println(fullName);
		
		fullName.replace(7, fullName.length(), "Singh Rajput");
		System.out.println(fullName);
		*/
	}

}
/*
append(): Appends a string representation of the argument to the current sequence.
insert(): Inserts the string representation of the argument into the current sequence at the specified index.
delete(): Removes characters from the current sequence.
replace(): Replaces characters in the current sequence with the specified string.*/

