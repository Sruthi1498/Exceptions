
public class User_defined extends Exception {
	static int n = 50;
	
	public static void main(String[] args) {
		try {
			if(n<100)
				 User_defined ud = new User_defined("less than 100");
				throw ud;
		}
		catch (User_defined ud) {
            ud.printStackTrace();
        }
	}

}
