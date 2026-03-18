package src.secao19.exemplo;

public class Principal {

    public static void main(String[] args) {
        Cachorro rex = new Cachorro();
        Gato pack = new Gato();

        rex.fazerSom();
        rex.pular();
        pack.fazerSom();
        pack.respirar();
        ExemploMetodo exemplo = new ExemploMetodo( );

        exemplo.meuMetodoAbstract();
        exemplo.meuMetodoDefault();


    }
}
