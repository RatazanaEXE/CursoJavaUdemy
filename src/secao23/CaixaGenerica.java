package src.secao23;

public class CaixaGenerica <T> {

    // atributo que armazena o objeto genérico
    private T coisaNaCaixa;

    // método para guardar um objeto na caixa
    public void guardar (T coisa){
        this.coisaNaCaixa = coisa;
    }

    // método para pegar o objeto da caixa
    public T pegar () {
        return coisaNaCaixa;
    }

    public static void main(String[] args) {

        // criando uma caixa para Carrinho
        CaixaGenerica <Carrinho> caixaDeCarrinhos = new CaixaGenerica<>();
        caixaDeCarrinhos.guardar(new Carrinho("HotWilson"));

        // criando uma caixa para Boneca
        CaixaGenerica <Boneca> caixaDeBoneca = new CaixaGenerica<>();
        caixaDeBoneca.guardar(new Boneca("Susi"));

        Carrinho carrinho = caixaDeCarrinhos.pegar();
        Boneca boneca = caixaDeBoneca.pegar();

        System.out.println(carrinho.getModelo());
        System.out.println(boneca.getNome());
    }
}