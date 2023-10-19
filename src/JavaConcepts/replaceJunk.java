package JavaConcepts;

public class replaceJunk {

	public static void main(String[] args) {
		String str="Software testing is the  à áâã äåæā processăąǎǟǡǻ  of Validation";
		String replaced=str.replaceAll("[^a-zA-Z0-9' ']", "");//^=other than alphabets and numbers
		System.out.println(replaced);

	}

}
