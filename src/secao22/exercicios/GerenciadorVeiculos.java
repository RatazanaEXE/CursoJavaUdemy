package src.secao22.exercicios;

public class GerenciadorVeiculos {
    public static void main(String[] args) {
        Veiculo onibus = new Onibus("ABC-123",1998, 12);
        Veiculo caminhao = new Caminhao("DEF-456",2006,2);

        onibus.exibirInformacoes();
        caminhao.exibirInformacoes();
    }
}
