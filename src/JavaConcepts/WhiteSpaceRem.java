package JavaConcepts;

public class WhiteSpaceRem {

	public static void main(String[] args) {
		String str ="TODO Auto    -    generated   method     stub";
		System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
	}

}
