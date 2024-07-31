package ex18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contatos {
    public static void main(String[] args) {
        Map<String, String> contatos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String comando;
        
        do {
            System.out.println("Digite um comando (adicionar/buscar/sair):");
            comando = scanner.nextLine();
            
            switch (comando) {
                case "adicionar":
                    System.out.println("Digite o nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o telefone:");
                    String telefone = scanner.nextLine();
                    contatos.put(nome, telefone);
                    break;
                case "buscar":
                    System.out.println("Digite o nome:");
                    nome = scanner.nextLine();
                    if (contatos.containsKey(nome)) {
                        System.out.println("Telefone: " + contatos.get(nome));
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
            }
        } while (!comando.equals("sair"));
    }
}
