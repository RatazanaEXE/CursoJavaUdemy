package src.secao16.exercicio2;

public class Assistente extends Funcionario{

    public String Ensino;

    public Assistente(String matricula,double salario, String nome, String Ensino) {
        super(matricula, salario, nome);
        this.Ensino = Ensino;
    }

    public static void main(String[] args) {
        Assistente assistente1 = new Assistente("123",2500.00, "Maria","Medio");
        System.out.println(assistente1.salario);
        assistente1.addAumento(500.00);
        System.out.println(assistente1.salario);
        System.out.println("A Assistente: "+ assistente1.nome+
                " de salario: "+ assistente1.salario+
                " recebe anualmente: "+assistente1.salarioAnual(assistente1.salario));


    }
}
