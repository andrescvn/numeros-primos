package numerosprimos;
public class NumerosPrimos {
    public static boolean p = false;
    public static void main(String arg[])
        {
        Metodos met = new Metodos();
        int numDigitos=met.pedirNumDigitos();
        int ndigitos=0;
        for(int i = 1; i <= 99999; i++ ){
            int divisionEntera = i;
            int contador=0;
            while (divisionEntera != 0){
            divisionEntera = divisionEntera / 10;
            contador++;
        }
        ndigitos=contador;    
        met.primos(ndigitos, numDigitos, i);
        }
        }
}