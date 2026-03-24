package src.asecaoAnterioresa14;

public class ConvenioMedico {
    public static void main(String[] args) {
        int codigoDeSaida = 3;

        for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++) {

            if (codigoDeSaida < codigoCarteirinha){
                continue;
            }

            if (codigoDeSaida == codigoCarteirinha){
                System.out.println(codigoCarteirinha);
                break;
            }

            System.out.println(codigoCarteirinha);
        }

    }
}
