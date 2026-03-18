package src.secao20;

public class LojaComercial extends Loja{

    @Override
    public String toString() {
        return "Loja Comercial " +
                "Razao Social='" + razaoSocial + '\'' +
                ", cnpj=" + cnpj;
    }

    public LojaComercial(long cnpj, String razaoSocial) {
        super(cnpj, razaoSocial);
    }

    public static void main(String[] args) {
        LojaComercial lojaMatriz = new LojaComercial(45545454454L, "JOAO DO CREPE");

        System.out.println(lojaMatriz);
        lojaMatriz.abrir();
        lojaMatriz.fechar();


    }
}
