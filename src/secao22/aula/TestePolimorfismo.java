package src.secao22.aula;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal meuCao = new Cachorro();
        Animal meuGato = new Gato();

           meuCao.fazerSom();
           meuGato.fazerSom();
           meuCao.tipo();
           meuGato.tipo();

        Object cachorro = new Cachorro();

        ((Cachorro) cachorro).fazerSom(); // isso é iNgual a isso

        Cachorro objConvertido = (Cachorro)  cachorro;
        objConvertido.fazerSom();
    }
}
