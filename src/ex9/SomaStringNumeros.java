package ex9;

import java.util.Scanner;

public class SomaStringNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite números separados por espaço:");
        String entrada = scanner.nextLine();
        String[] numeros = entrada.split(" ");
        
        int soma = 0;
        for (String numero : numeros) {
            soma += Integer.parseInt(numero);
        }
        
        System.out.println("Soma total: " + soma);
    }
}
