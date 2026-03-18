package src.Secao14;
//Aula 92, 93, 94
public class Funcionario {
    private String nome;
    private String cargo;
    private int idade;
    private double salario;


    public Funcionario (String nome,String cargo, int idade, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public String obterInfo (){
        return "Nome:" + nome + " Cargo:" + cargo + " Idade:" + idade + " Salario: " + salario;
    }

    public void aumentarSalario (double aumento){
        salario += aumento;
    }

    public void alterarQualquerSalario (Funcionario func, double novoSalario){
        func.salario = novoSalario;
    }

    public void aumentarSalario(int porcentagem){
        salario += salario * porcentagem/100.0;

    }


//    public static void main(String[] args) {
//        Funcionario funcionario1 = new Funcionario("João","Dev", 30);
//        Funcionario funcionario2 = new Funcionario("Maria", "Gerente", 50);
//
//        System.out.println("Nome: " + funcionario1.nome);
//        System.out.println("Cargo: " + funcionario1.cargo);
//        System.out.println("Idade: " + funcionario1.idade);
//
//        System.out.println("Nome: " + funcionario2.nome);
//        System.out.println("Cargo: " + funcionario2.cargo);
//        System.out.println("Idade: " + funcionario2.idade);
//    }

}
