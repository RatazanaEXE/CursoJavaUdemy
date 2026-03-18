package src.Secao14;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto (String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String obterInfo (){
        return "Nome:" + nome + " Preço:" + preco +
                " Quantidade no Estoque:" +quantidadeEmEstoque;
    }

    public static void main(String[] args) {
        Produto colher = new Produto("Colher", 1.50, 50 );

        System.out.println(colher.obterInfo());
    }
}
