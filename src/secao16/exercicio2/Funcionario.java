package src.secao16.exercicio2;

public abstract class Funcionario {
    public String matricula;
    public String nome;
    public double salario;


    public Funcionario( String matricula,double salario, String nome){
        this.matricula = matricula;
        this.salario = salario;
        this.nome=nome;
    }

    public double addAumento(double valorDoAumento) {
        this.salario += valorDoAumento;
        return this.salario;
    }

    public double salarioAnual (double salario){
        double totalAnual = salario * 12;
        return totalAnual;
    }


}



