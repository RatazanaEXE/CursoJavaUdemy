package src.secao14;

public class Personagem {
    public String nome;
    public int niveladorDePoder;

    public Personagem(String nome, int niveladorDePoder) {
        this.nome = nome;
        this.niveladorDePoder = niveladorDePoder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int tentarAumentarNivelDePoder (Personagem p){
        p.niveladorDePoder += 10;
        return niveladorDePoder;
    }

    public String mudadorDeNome(String novoNome) {
        setNome(novoNome);
        return getNome();
    }

    }
