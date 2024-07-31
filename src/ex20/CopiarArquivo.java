package ex20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarArquivo {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("origem.txt");
             FileOutputStream fos = new FileOutputStream("destino.txt")) {
             
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
