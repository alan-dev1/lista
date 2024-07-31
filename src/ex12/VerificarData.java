package ex12;

import java.time.LocalDate;

public class VerificarData {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2024, 7, 1);
        LocalDate data2 = LocalDate.of(2024, 8, 1);
        
        if (data1.isBefore(data2)) {
            System.out.println("Data1 é antes de Data2");
        } else if (data1.isAfter(data2)) {
            System.out.println("Data1 é depois de Data2");
        } else {
            System.out.println("Data1 é igual a Data2");
        }
    }
}
