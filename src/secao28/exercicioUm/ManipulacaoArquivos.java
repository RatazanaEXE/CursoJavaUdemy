package src.secao28.exercicioUm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulacaoArquivos {

    public static void main(String[] args) {

        Arquivo obj = new Arquivo("meuArquivoExercicio.txt", "Olá, mundo!");


        obj.ler();

    }
}