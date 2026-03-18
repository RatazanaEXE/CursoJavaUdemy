package src.secao17.exercicio2;

public class MinhaClasse {
    int a ;
    int b ;

    public MinhaClasse(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Deprecated
    public int calcularSoma(int a,int b){
        int x = a + b;
        return x;
    }
    public int calcularProduto(int a,int b ){
        int y = a * b;
        return y;
    }

}
