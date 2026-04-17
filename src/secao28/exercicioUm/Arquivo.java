package src.secao28.exercicioUm;

public class Arquivo {
    String nomeArquivo;
    String conteudo;

    public Arquivo(String nomeArquivo, String conteudo) {
        this.nomeArquivo = nomeArquivo;
        this.conteudo = conteudo;
    }

    public void ler() {
        System.out.println("Lendo arquivo: " + this.nomeArquivo);
        System.out.println("Lendo conteudo: " + this.conteudo);
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}


