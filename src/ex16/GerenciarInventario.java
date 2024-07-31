package ex16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciarInventario {
    public static void main(String[] args) {
        Map<String, Integer> inventario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String comando;
        
        do {
            System.out.println("Digite um comando (adicionar/remover/buscar/listar/sair):");
            comando = scanner.nextLine();
            
            switch (comando) {
                case "adicionar":
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a quantidade:");
                    int quantidade = Integer.parseInt(scanner.nextLine());
                    inventario.put(nome, inventario.getOrDefault(nome, 0) + quantidade);
                    break;
                case "remover":
                    System.out.println("Digite o nome do produto:");
                    nome = scanner.nextLine();
                    if (inventario.containsKey(nome)) {
                        System.out.println("Digite a quantidade para remover:");
                        quantidade = Integer.parseInt(scanner.nextLine());
                        inventario.put(nome, inventario.get(nome) - quantidade);
                        if (inventario.get(nome) <= 0) {
                            inventario.remove(nome);
                        }
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case "buscar":
                    System.out.println("Digite o nome do produto:");
                    nome = scanner.nextLine();
                    if (inventario.containsKey(nome)) {
                        System.out.println("Quantidade: " + inventario.get(nome));
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case "listar":
                    for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
            }
        } while (!comando.equals("sair"));
    }
}
