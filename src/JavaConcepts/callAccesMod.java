package JavaConcepts;

public class callAccesMod {
	public static void main(String a[])
	{
		accessModif ob=new accessModif();

		System.out.println(ob.s);//default
		System.out.println(ob.p);//public
		//System.out.println(ob.q);//private
		System.out.println(ob.r);//protected
	}

}
