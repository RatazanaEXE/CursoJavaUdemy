package src.secao14;

public class Livro {
    public String titulo;
    private String autor;
    protected int ano;
    double preco;

    public Livro (){}
    public Livro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public Livro(String titulo, String autor, int ano, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;

    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        Livro livro2 = new Livro("Aurora", "Ana");
        Livro livro3 = new Livro ("Jogos" ,"Katarina ",1990 ,1.99);

        System.out.println(livro);
        System.out.println(livro2);
        System.out.println(livro3);
    }


}
