package src.secao19.exercicio2;

public class Pedido implements PedidoRestaurante{
    String nome;
    double valor;
    double total;

    public void adicionarItem(String nome, double valor) {
        System.out.println("Item: " + nome + " - Preço: R$" + valor);
        total = total + valor;
    }

    public double calcular() {
        System.out.println("o total é: " + total);
        return total;
    }


}
