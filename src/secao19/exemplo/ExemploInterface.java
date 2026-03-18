package src.secao19.exemplo;

public interface ExemploInterface {
    // Método abstract
    void meuMetodoAbstract();

    // Método default
    default void meuMetodoDefault() {
        System.out.println("Implementacao do método default");
    }

    // Método static
    static void meuMetodoStatic() {
        System.out.println("Implementação do método static");
    }
}