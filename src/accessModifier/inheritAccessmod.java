package accessModifier;

import JavaConcepts.accessModif;

public class inheritAccessmod extends accessModif {

	public static void main(String[] args) {
		accessModif ob=new accessModif();

		//System.out.println(ob.s);//default
		System.out.println(ob.p);//public
		//System.out.println(ob.q);//private
		//System.out.println(ob.r);//protected

	}

}
