package ex14;

import java.util.Arrays;
import java.util.List;

public class OrdenarNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 3, 8, 1, 2);
        numeros.sort(Integer::compareTo);
        System.out.println("Números ordenados: " + numeros);
    }
}
