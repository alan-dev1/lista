package ex7;

import java.util.ArrayList;
import java.util.List;

public class ConverterStrings {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3");
        List<Integer> numeros = new ArrayList<>();
        
        for (String str : strings) {
            numeros.add(Integer.parseInt(str));
        }
        
        System.out.println(numeros);
    }
}
