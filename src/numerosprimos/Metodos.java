/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import javax.swing.JOptionPane;
import static numerosprimos.NumerosPrimos.p;

/**
 *
 * @author acomesanavila
 */
public class Metodos {
        public static int pedirNumDigitos(){
         int numDigitos=Integer.parseInt(JOptionPane.showInputDialog("introducir numero"));
        if(numDigitos<=0)
         do{
       numDigitos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): "));
        } while (numDigitos<=0||numDigitos>5);
        return numDigitos;
    }
        
        public void primos(int ndigitos,int numDigitos,int i){
            if(ndigitos==numDigitos){
            if (i < 4) 
                       p = true;
            else{if (i % 2 == 0) 
                p = false; 
            else{
                    int contador1 = 0;  
                    int i1 = 1; 
                    int limite = (i - 1) / 2; 
                    if  (limite % 2 == 0) limite--;  
             
                    while(i1 <= limite){
                        if (i % i1 == 0) contador1++;
                            i1 += 2;
                            if (contador1 == 2) i1 = limite + 1;
                    }
 
            if (contador1 == 1) 
            p = true;
            } 
        } 
     
                if (p == true) 
                    System.out.println(i);    
            }
        }
}
