package numerosprimos;

public class NumerosPrimos {

    public static boolean primo = false;

    public static void main(String arg[]) {
        Metodos met = new Metodos();
        int numDigitos = met.pedirNumDigitos();
        for (int i = 1; i <= 99999; i++) {
            int cDigitos = met.calculaDigitos(i);
            if (cDigitos == numDigitos) {
                if (i < 4) {
                    primo = true;
                } else if (i % 2 == 0) {
                    primo = false;
                } else {
                    met.sacarPrimo(i);
                }
            }
            met.amosar(i);
        }
    }
}
