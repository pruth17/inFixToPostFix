/**
@author Pruthvi Punwar
*/


public class Driver {
	
	public static void main(String[] args) {
		
	Postfix a = new Postfix();
		String exp = "a/b*(c+(d-e))";
	
		String s = a.infixToPostfix(exp);
		System.out.println(s);
		
		
	}

}
