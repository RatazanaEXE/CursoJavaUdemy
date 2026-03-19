package src.sesao23.aula.exercicio;

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

    @Override
    public String toString() {
        return "Polvo{" +
                "nome='" + nome + '\'' +
                ", tentaculo=" + tentaculo +
                '}';
    }
}
