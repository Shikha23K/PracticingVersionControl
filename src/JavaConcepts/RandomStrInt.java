package JavaConcepts;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
public class RandomStrInt {

	public static void main(String[] args) {
		//Approach 1- Random class
		
		Random rand=new Random();
		int randomVal=rand.nextInt(1000);
		System.out.println("Random Integer  "+randomVal);
		
		double randDouble=rand.nextDouble();// Default range 0.0 to 1.0
		System.out.println("Random Double  "+randDouble);
		
		//Approach 2- Math.random()
		System.out.println("Approach 2 for Decimal random  "+Math.random());
	
		
		//Approach 3 Apache commons Land API
		//Download Apache common lang zip file
		//Add jar file to build path
		
		String RandNum=RandomStringUtils.randomNumeric(5);//5 digit integer value in String format
		System.out.println(RandNum);
	
		
		//Random Strings
		String RandStr=RandomStringUtils.randomAlphabetic(10);
		System.out.println(RandStr.toUpperCase());
	}
	
	

}
