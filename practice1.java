package exceptionHandling;

public class practice1 {

	
	public static void main(String[] args) throws Exception {
		
		
		try {
			
			
			System.out.println(1/0);
			
		}
		catch(Exception a)
		{
			throw new loginException("Invalid credentials");
			
		}
	}
	
	
	
}
