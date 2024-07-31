package ex2;

public class ContarVogais {

	public static void main(String[] args) {
	      String s = "exemplo";
	        System.out.println(contarVogais(s));
	    }

	    private static int contarVogais(String s) {
	        int count = 0;
	        for (char c : s.toLowerCase().toCharArray()) {
	            if ("aeiou".indexOf(c) != -1) {
	                count++;
	            }
	        }
	        return count;
	    }

	}



  

