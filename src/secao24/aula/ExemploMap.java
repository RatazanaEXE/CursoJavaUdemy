package src.secao24.aula;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Dez", 10);
        mapa.put("Vinte", 20);
        mapa.put("Trinta", 30);

        //Verificando se contém uma chave
        System.out.println("Contém Dez? " + mapa.containsKey("Dez"));

        //Obtendo o valor associado a uma chave
        System.out.println("Valor associado a 'Vinte': " + mapa.get("Vinte"));

        //Adicionando mais elementos
        mapa.put("Quinze" ,15);
        mapa.put( "Dois" , 2);

        //Imprimeindo sem ordem
        System.out.println("Mapa Completo: " + mapa);

        //Removendo Elemento
        mapa.remove("Dois");
        System.out.println("Após remoção " + mapa);

        //Atualizando Valor
        mapa.put("Trinta", 32);
        System.out.println("Após atualização: " +mapa);

        mapa.clear();
        System.out.println("Mapa limpo: " + mapa);


    }
}
