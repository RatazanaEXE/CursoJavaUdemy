package src.secao19.exemplo;

public class ExemploMetodo implements ExemploInterface{
    public void meuMetodoAbstract() {
    }

    public void meuMetodoDefault() {
        ExemploInterface.super.meuMetodoDefault();
    }

}
