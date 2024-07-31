package ex6;

public class MaiorValor {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 9, 2};
        int maior = array[0];
        
        for (int valor : array) {
            if (valor > maior) {
                maior = valor;
            }
        }
        
        System.out.println("Maior valor: " + maior);
    }
}
