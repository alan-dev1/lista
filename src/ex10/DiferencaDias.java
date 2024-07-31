package ex10;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DiferencaDias {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2024, 7, 1);
        LocalDate data2 = LocalDate.of(2024, 8, 1);
        
        long diferenca = ChronoUnit.DAYS.between(data1, data2);
        System.out.println("Diferença em dias: " + diferenca);
    }
}
