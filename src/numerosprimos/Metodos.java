/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import javax.swing.JOptionPane;
import static numerosprimos.NumerosPrimos.primo;

/**
 *
 * @author acomesanavila
 */
public class Metodos {

    public static int pedirNumDigitos() {
        int numDigitos = Integer.parseInt(JOptionPane.showInputDialog("introducir numero"));
        while (numDigitos <= 0 || numDigitos > 5) {
            numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): "));
        }
        return numDigitos;
    }

    public int calculaDigitos(int i) {
        int divisionEntera = i;
        int cDigitos = 0;
        while (divisionEntera != 0) {
            divisionEntera = divisionEntera / 10;
            cDigitos++;
        }
        return cDigitos;
    }

    public boolean sacarPrimo(int i) {
        int contador = 0;
        int i1 = 1;
        int limite = (i - 1) / 2;
        if (limite % 2 == 0) {
            limite--;
        }
        while (i1 <= limite) {
            if (i % i1 == 0) {
                contador++;
            }
            i1 += 2;
            if (contador == 2) {
                i1 = limite + 1;
            }
        }
        if (contador == 1) {
            primo = true;
        }
        return primo;
    }

    public void amosar(int i) {
        if (primo == true) {
            System.out.println(i);
        }
    }
}
