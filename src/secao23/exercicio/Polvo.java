package src.secao23.exercicio;

public class Polvo {
    String nome;
    int tentaculo;

    public Polvo(String nome, int tentaculo) {
        this.nome = nome;
        this.tentaculo = tentaculo;
    }

    public String getNome() {
        return nome;
    }

    public int getTentaculo() {
        return tentaculo;
    }

    @Override
    public String toString() {
        return "Polvo{" +
                "nome='" + nome + '\'' +
                ", tentaculo=" + tentaculo +
                '}';
    }
}
