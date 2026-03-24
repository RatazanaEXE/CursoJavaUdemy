package src.secao24.artigo.ExemploOrdenacaoLista;
//https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450
import java.util.*;

public class ListaAlunoComparator {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<Aluno>();
        ComparaAluno ca = new ComparaAluno();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista,ca);
        System.out.println(lista);

    }
}
