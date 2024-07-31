package ex1;

public class Palindromo {

	public static void main(String[] args) {
		 String s = "arara";
	        System.out.println(isPalindromo(s));

	}
	private static boolean isPalindromo(String s) {
	    String reversed = new StringBuilder(s).reverse().toString();
	    return s.equals(reversed);
	}
}
