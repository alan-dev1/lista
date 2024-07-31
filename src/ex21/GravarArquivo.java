package ex21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravarArquivo {
    public static void main(String[] args) {
        String[] linhas = {"Linha 1", "Linha 2", "Linha 3"};
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("saida.txt"))) {
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
