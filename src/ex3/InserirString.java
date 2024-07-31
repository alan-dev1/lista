package ex3;

public class InserirString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        String toInsert = "Java ";
        int position = 6;
        
        sb.insert(position, toInsert);
        System.out.println(sb.toString());
    }
}

