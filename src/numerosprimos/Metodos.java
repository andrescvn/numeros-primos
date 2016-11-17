/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Metodos {
        public int pedirNumDigitos(){
         int numDigitos=Integer.parseInt(JOptionPane.showInputDialog("introducir numero"));
        if(numDigitos<=0)
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        return numDigitos;
    }
}
