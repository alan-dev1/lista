package ex13;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String comando;
        
        do {
            System.out.println("Digite um comando (adicionar/remover/listar/sair):");
            comando = scanner.nextLine();
            
            switch (comando) {
                case "adicionar":
                    System.out.println("Digite a tarefa:");
                    tarefas.add(scanner.nextLine());
                    break;
                case "remover":
                    System.out.println("Digite o índice da tarefa para remover:");
                    int index = Integer.parseInt(scanner.nextLine());
                    if (index >= 0 && index < tarefas.size()) {
                        tarefas.remove(index);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case "listar":
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + ": " + tarefas.get(i));
                    }
                    break;
            }
        } while (!comando.equals("sair"));
    }
}
