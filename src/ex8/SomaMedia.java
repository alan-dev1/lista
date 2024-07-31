package ex8;

import java.util.List;

public class SomaMedia {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        int soma = 0;
        
        for (int num : numeros) {
            soma += num;
        }
        
        double media = (double) soma / numeros.size();
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
