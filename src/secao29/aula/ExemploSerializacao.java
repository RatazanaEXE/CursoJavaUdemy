package src.secao29.aula;

import java.io.*;
import java.util.*;

public class ExemploSerializacao {
    // Método responsável por SALVAR (serializar) a lista de contatos em um arquivo
    private static void serializarContato (List<Contato> listaContatos) throws IOException {

        // Cria um ObjectOutputStream que vai escrever objetos em um arquivo chamado "agenda.ser"
        // FileOutputStream abre/cria o arquivo, e ObjectOutputStream permite salvar objetos nele
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("agenda.ser"))) {

            // Escreve (serializa) a lista de contatos no arquivo
            outputStream.writeObject(listaContatos);

            // Mensagem de confirmação no console
            System.out.println("Contato salvo!");
        } // Aqui o stream é fechado automaticamente por causa do try-with-resources
    }


    // Método responsável por LER (desserializar) os contatos do arquivo
    @SuppressWarnings("unchecked")
    private static void deserializarContato() throws IOException, ClassNotFoundException{

        // Cria um ObjectInputStream para ler objetos do arquivo "agenda.ser"
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda.ser"))){

            // Lê o objeto do arquivo e converte (cast) para List<Contato>
            List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();

            // Percorre a lista de contatos lida
            for (Contato contato : contatosLidos){

                // Imprime os dados de cada contato no console
                System.out.println("Nome: " + contato.nome + ", Telefone: " + contato.telefone);
            }
        } // Aqui o stream também é fechado automaticamente
    }

    public static void main(String[] args) {
        List<Contato> listaContatos = new ArrayList<>();
        listaContatos.add(new Contato("Claudia Carvalho", "44999990001"));
        listaContatos.add(new Contato("João Silva", "44999990002"));
        listaContatos.add(new Contato("Maria Souza", "44999990003"));
        listaContatos.add(new Contato("Pedro Santos", "44999990004"));
        listaContatos.add(new Contato("Ana Oliveira", "44999990005"));
        listaContatos.add(new Contato("Lucas Pereira", "44999990006"));
        listaContatos.add(new Contato("Fernanda Costa", "44999990007"));
        listaContatos.add(new Contato("Rafael Almeida", "44999990008"));
        listaContatos.add(new Contato("Juliana Martins", "44999990009"));
        listaContatos.add(new Contato("Bruno Rocha", "44999990010"));

        try {
            serializarContato(listaContatos);
            deserializarContato();
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Erro ao manipular contatos: " + e.getMessage());
        }
    }
}
