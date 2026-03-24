package src.secao14.empresa;

import src.secao14.Funcionario;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Ana", "Dev", 18, 5000.00);
        System.out.println(funcionario1.obterInfo());
        funcionario1.aumentarSalario(1000);
        System.out.println(funcionario1.obterInfo());


    }
}
