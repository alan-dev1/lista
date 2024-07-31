package ex11;

import java.time.LocalDate;

public class AdicionarDias {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2024, 7, 1);
        int diasParaAdicionar = 10;
        
        LocalDate novaData = data.plusDays(diasParaAdicionar);
        System.out.println("Nova data: " + novaData);
    }
}
