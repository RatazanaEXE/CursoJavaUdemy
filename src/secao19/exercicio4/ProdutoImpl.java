package src.secao19.exercicio4;

public class ProdutoImpl implements Produto {
    int total = 0;

    public ProdutoImpl() {
        nome();
        quantidade();
    }
    public String getnome() {
        return nome();
    }

    public int getQuantidade() {
        return quantidade();
    }
    public int adicionarQuantidade(int quantidade){
        total = total + quantidade;
        System.out.println("Quantidade atual "+ total);
        return total;

    }
    public int removerQuantidade(int quantidade){
        total = total - quantidade;
        System.out.println("Quantidade atual "+ total);
        return total;
    }


    public String nome() {
        return "";
    }

    public int quantidade() {
        return 0;
    }
}