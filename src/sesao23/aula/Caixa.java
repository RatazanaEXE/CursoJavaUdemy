package src.sesao23.aula;

public class Caixa <T>{
    private T objNaCaixa;

    public void guardar (T obj){
        this.objNaCaixa = obj;
    }

    public T pegar (){
        return objNaCaixa;
    }

    public static void main(String[] args) {
        Caixa <String> caixaDeText = new Caixa<>();
        Caixa<Integer> caixaDenum = new Caixa<>();

        caixaDeText.guardar("Amor pelo Dougras");
        caixaDenum.guardar(8000);

        System.out.println("Aqui está "+ caixaDeText.pegar());
        System.out.println("Aqui está "+ caixaDenum.pegar());
    }
}
