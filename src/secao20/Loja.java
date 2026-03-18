package src.secao20;

public abstract class  Loja {
    long cnpj;
    String razaoSocial;

    protected void abrir (){
        System.out.println("Aberta");
    }
    protected void fechar (){
        System.out.println("Fechada");
    }

    public Loja(long cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
}
