
public class Arithmetic {

	public static void main(String args[])
    {
        try {
            
            int a = 10/0; 
            System.out.println ("Result = " + a);
        }
        catch(ArithmeticException e) {
            System.out.println ("Arithmetic Exception");
        }
    }
}
