package src.secao26.aula;
import java.util.*;

public class LambdaComCollection {

    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5);
        listaDeNumeros.forEach((elementos) -> System.out.println(elementos));
           /* for (Integer elemento : listaDeNumeros) {
            System.out.println(elemento);
           }*/
    }
}
