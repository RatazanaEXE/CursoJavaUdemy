package src.secao23.exercicioDois;

public class Testando {
    public static void main(String[] args) {

        Caixa <Double> decimais  = new Caixa <>();
        Caixa <Character> letras  = new Caixa <>();
        Caixa <String> nome  = new Caixa <>();

        decimais.adicionar(3.0, 0);
        decimais.adicionar(3.0, 1);
        letras.adicionar( 'a', 0);
        nome.adicionar("Ana Beatriz", 0);




    }
}
