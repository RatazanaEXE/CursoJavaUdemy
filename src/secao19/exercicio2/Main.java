package src.secao19.exercicio2;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem("Hamburguer vegan", 30.50);
        pedido.adicionarItem("coca-lata", 7.50);

        pedido.adicionarItem("Hamburguer do comodoro", 30.50);
        pedido.adicionarItem("coca-lata", 7.50);

        pedido.adicionarItem("chopp de vinho" , 7.00);
        pedido.adicionarItem("chopp de vinho" , 7.00);

        pedido.calcular();
    }
}
