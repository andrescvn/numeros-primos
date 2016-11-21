package numerosprimos;
public class NumerosPrimos {
    public static boolean primo = false;
    public static void main(String arg[]) {
        Metodos met = new Metodos();
        int numDigitos = met.pedirNumDigitos();
        for (int i = 1; i <= 99999; i++) {
            int divisionEntera = i;
            int nDigitos = 0;
            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                nDigitos++;
            }
            met.primos(nDigitos, numDigitos, i);
        }
    }
}
