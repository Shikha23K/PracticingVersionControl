package JavaConcepts;

public class extendEncaps extends Encaps {

	public static void main(String[] args) {
		
		Encaps ob=new Encaps();
		ob.setValue(190);
		int getv=ob.getValue();
		System.out.println("The inherited value "+getv);
		String nam=ob.getName();
		System.out.println("The inherited name "+nam);
		
				

	}

}
