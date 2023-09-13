package typeCasting;

public class typeCasting {
	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit of the type casting");
		
		int a=6;
		System.out.println("value in int:" +a);
		
		float g='a';
		System.out.println("value in float:" +g);
		
		long r='g';
		System.out.println("value in long:" +r);
		
		double i='k';
		System.out.println("value double:" +i);
		
		System.out.println("\n");
		
		System.out.println("Explicit type casting");
		
		//explicit conversation
		double y=10.66;
		System.out.println("value in double:" +y);
		float l=(float)y;
		
		System.out.println("value in float:" +l);
		int z=(int)y;
		
		System.out.println("value in int:" +z);
	}

}
