package ex15;

import java.util.List;

public class MaiorMenorValor {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(10, 2, 8, 7, 3);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
