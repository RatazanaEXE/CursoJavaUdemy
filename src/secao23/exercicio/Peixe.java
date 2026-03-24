package src.secao23.exercicio;

public class Peixe {
    String nome;
    double tamanho;

    public Peixe(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "Nome='" + nome + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}
