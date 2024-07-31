package ex5;
import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Random rand = new Random();
        int numero = rand.nextInt(100) + 1;
        System.out.println("Número aleatório: " + numero);
    }
}
