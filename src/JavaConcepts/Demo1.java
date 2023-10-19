package JavaConcepts;

public class Demo1 {

	public static void main(String[] args) {
		String fName=new String("Suresh");
		String mName=" Kumar ";
		String fullName=fName.concat(mName);
		int l= fullName.trim().length();
		
		System.out.println(fullName);
		System.out.println(fName.concat(mName));//concatenation		
		System.out.println("The Length of First Name is: "+l);//length
		System.out.println(fullName.substring(2,l-2));//substring
		System.out.println(fName+mName.replace(mName.charAt(3),'v'));//replace		
		System.out.println(fullName.toUpperCase());//toUpper
		
		if(fName.equals(fullName)==true)//equals
			System.out.println("They have same name. ");
		else
			System.out.println("They have different name. ");
		
		System.out.println("Char 'r' in name occured first at "+fullName.indexOf('r'));//indexOf
		System.out.println("Char 'r' in name occured first at "+fullName.lastIndexOf('r'));//lastIndexOf
		System.out.println(fullName);
		if(fullName.startsWith("Sur")==true)
		System.out.println("Yes name starts with 'Sur'");//startsWith
		else
			System.out.println("No name does not start with 'Sur'");//startsWith
	}

}
/*length(): Returns the length of the string.
charAt(int index): Returns the character at the specified index.
substring(int beginIndex): Returns a substring from the specified index.
substring(int beginIndex, int endIndex): Returns a substring from the beginIndex to the endIndex (exclusive).
concat(String str): Concatenates the specified string to the end of the current string.
equals(String anotherString): Compares two strings for equality (content comparison).
equalsIgnoreCase(String anotherString): Compares two strings for equality, ignoring case.
indexOf(String str): Returns the index of the first occurrence of the specified substring.
lastIndexOf(String str): Returns the index of the last occurrence of the specified substring.
startsWith(String prefix): Checks if the string starts with the specified prefix.
endsWith(String suffix): Checks if the string ends with the specified suffix.
*/

