
public class StringIndex {

	public static void main(String[] args) {
		try {
		String s = "hello world";
		System.out.println(s.charAt(100));		
	}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StrinIndex Out of bound");
		}
	}
}
