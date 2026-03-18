package src.secao16.exercicio3;

public class Estudante extends Pessoa{
    String matricula;
    public Estudante(int idade, String nome, String matricula) {
        super(idade, nome);
        this.matricula = matricula;
    }

    public static void main(String[] args) {
        Estudante es = new Estudante(10, "giovana","123");
        System.out.println(es.matricula);
        System.out.println(es.getIdade());
        System.out.println(es.getNome());
    }
}
