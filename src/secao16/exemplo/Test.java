package src.secao16.exemplo;

    class Animal {
    public void comer() {
        System.out.println("Animal comendo");
    }
}

    class Cachorro extends Animal {
        //public void latir (){System.out.println("AU-AU");}
        public void comer() {
            System.out.println("Comer");
        }
    }
    public class Test {
        public static void main(String[] args) {
            Cachorro dog = new Cachorro();
//            dog.latir();
            dog.comer();

        }
    }

