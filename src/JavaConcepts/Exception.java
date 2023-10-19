package JavaConcepts;

public class Exception {


	public static int divide(int a, int b)
	{
		return(a/b);
	}

	public static void main(String[] args) {
		try
		{
			int result = divide(10,0);
			System.out.println("Result is  " +result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catching exception"+e);
		}
		 
		finally {
			System.out.println("the finale statement");
		}
	}


}
