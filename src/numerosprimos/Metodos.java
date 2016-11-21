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
        while (numDigitos <= 0 || numDigitos > 5) 
            numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): "));
        return numDigitos;
    }
    

    public void primos(int nDigitos, int numDigitos, int i) {
        if (nDigitos == numDigitos) {
            if (i < 4) {
                primo = true;
            } else if (i % 2 == 0) {
                primo = false;
            } else {
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
            }
            if (primo == true) {
                System.out.println(i);
            }
        }
    }
    
}
