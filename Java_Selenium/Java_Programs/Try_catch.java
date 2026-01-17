import java.util.InputMismatchException;

public class MyClass2 {

	public static void main(String[] args) {
		
		try
		{
			int i = 10/0;
			System.out.println("Div is " + i);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Something went wrong " + e.getMessage());
			System.out.println("PLease provide positive integer ");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter only integer ");
		}
		catch (Exception e)
		{
			System.out.println("Something went wrong ");
		}
		
		finally
		{
			System.out.println("Its End of program ");
		}
	}
}
