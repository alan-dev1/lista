package ex17;

import java.util.HashMap;
import java.util.Map;

public class ContarPalavras {
    public static void main(String[] args) {
        String texto = "o rato roeu a roupa do rei de roma";
        String[] palavras = texto.split("\\s+");
        Map<String, Integer> frequencias = new HashMap<>();
        
        for (String palavra : palavras) {
            frequencias.put(palavra, frequencias.getOrDefault(palavra, 0) + 1);
        }
        
        System.out.println(frequencias);
    }
}
