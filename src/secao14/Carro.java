package src.secao14;

public class Carro{
    String marca;
    String modeloCarro;
    int anoDoCarro;

    public Carro (){}

    public Carro(String marca, String modeloCarro ){
        this.marca = marca;
        this.modeloCarro = modeloCarro;
    }

    public Carro (String marca, String modeloCarro, int anoDoCarro){
        this.marca = marca;
        this.modeloCarro = modeloCarro;
        this.anoDoCarro = anoDoCarro;
    }

    public String exibirDetalhes(){
        return "Marca:" + marca + " Modelo:" + modeloCarro + " Ano:" + anoDoCarro;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("ww", "gol");
        Carro carro3 = new Carro("Porche", "Sei lá", 1996);

        System.out.println(carro1.exibirDetalhes());
        System.out.println(carro2.exibirDetalhes());
        System.out.println(carro3.exibirDetalhes());
    }

}

