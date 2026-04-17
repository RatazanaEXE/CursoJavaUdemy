package src.secao28.exercicioUm;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulacaoArquivo {
    public static void main(String[] args) {
        String caminho = "src/secao28/exercicioUm/meuArquivo.txt";

        escreverArquivo(caminho, "Olá, mundo!");
        lerArquivo(caminho);
    }

    public static void escreverArquivo(String caminho, String texto) {
        try (FileWriter writer = new FileWriter(caminho)) {
            writer.write(texto);
        } catch (IOException e) {
            System.out.println("Erro ao escrever: " + e.getMessage());
        }
    }

    public static void lerArquivo(String caminho) {
        try (FileReader reader = new FileReader(caminho)) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }
    }
}
