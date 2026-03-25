package src.secao24.aula;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        Set<String> conjunto = new HashSet<>();

        conjunto.add("java");
        conjunto.add("Python");
        conjunto.add ("C++");

        System.out.println(conjunto);

        System.out.println("Contém java? " + conjunto.contains("java"));

        conjunto.add("JavaScript");
        conjunto.add ("Ruby");

        System.out.println("Conjunto completo " + conjunto);
        conjunto.remove("Python");
        System.out.println("removendo Python:" + conjunto);

        boolean foiAdd = conjunto.add("java");
        System.out.println("java foi add novamente? "+ foiAdd);

        conjunto.clear();
        System.out.println("conjunto limpo: " + conjunto);

    }
}
