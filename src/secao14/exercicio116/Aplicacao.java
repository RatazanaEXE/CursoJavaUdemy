package src.secao14.exercicio116;

public class Aplicacao {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("ana", 19, "Mariano Torres","9999-9999");
        Pessoa pessoa2 = new Pessoa("Dougras", 19, "Mariano tower's","XX-XXXX-XXXX");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Endereço: "+pessoa1.getEndereco());
        System.out.println("Teléfono: "+pessoa1.getTelefone());
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Endereço: "+pessoa2.getEndereco());
        System.out.println("Teléfono: "+pessoa2.getTelefone());


        pessoa1.setNome("Alterado para: " + "Craudetew");
        System.out.println(pessoa1.getNome());
        System.out.println("Número de pessoas é: " + Pessoa.numeroDePessoas);

    }
}
