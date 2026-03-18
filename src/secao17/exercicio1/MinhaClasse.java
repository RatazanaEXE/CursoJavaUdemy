package src.secao17.exercicio1;

public class MinhaClasse extends SuperClasse {

    @Override
    public void imprime(){
        System.out.println("B");
    }
    public void fala(){
        System.out.println("cocoricó");
    }

    public static void main(String[] args) {
        MinhaClasse x = new MinhaClasse();
        x.imprime();
        x.fala();
    }
}
