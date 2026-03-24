package src.secao23;
/*Este código utiliza Object para armazenar diferentes tipos de objetos,
exigindo o uso de instanceof e casting explícito na hora de recuperar o valor.
Essa é uma forma antiga e menos segura de simular generics em Java.
Antes da introdução de Generics (Java 5), esse padrão era comum,
porém pode causar erros em tempo de execução. Hoje, o recomendado é usar Generics,
que garantem segurança de tipo em tempo de compilação e deixam o código mais limpo e legível.*/
public class CaixaDeBrinquedos {
    private Object coisaNaCaixa;

    public void  guardar (Object coisa){
        this.coisaNaCaixa = coisa;
    }
    public Object pegar(){
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        //Criando uma caixa p guardar carrinhos
        CaixaDeBrinquedos caixaDeCarrinhos = new CaixaDeBrinquedos();
        caixaDeCarrinhos.guardar (new Carrinho("Hot Wheels"));

        //Criando uma caixa para boneca
        CaixaDeBrinquedos caixaDeBonecas = new CaixaDeBrinquedos();
        caixaDeBonecas.guardar(new Boneca("Barbie"));

        //Verificamos o tipo do objeto antes de fazer o cast
        if (caixaDeCarrinhos.pegar() instanceof Carrinho){
            Carrinho carrinho = (Carrinho) caixaDeCarrinhos.pegar();
            System.out.println(carrinho.getModelo());
        }

        if (caixaDeBonecas.pegar() instanceof Boneca){
            Boneca boneca = (Boneca) caixaDeBonecas.pegar();
            System.out.println(boneca.getNome());
        }


    }
}
