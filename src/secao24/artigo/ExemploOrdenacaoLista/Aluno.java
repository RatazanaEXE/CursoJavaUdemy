package src.secao24.artigo.ExemploOrdenacaoLista;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String curso;
    double nota;

    Aluno(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public String toString() {
        return this.nome;
    }

    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }

    public int hashCode() {
        return this.nome.hashCode();
    }
    public boolean equals(Object o) {
        Aluno a = (Aluno) o;
        return this.nome.equals(a.getNome());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

