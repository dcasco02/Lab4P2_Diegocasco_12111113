/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_diegocasco_12111113;

import javax.swing.JOptionPane;

/**
 *
 * @author dcasc
 */
public class Lab4P2_Diegocasco_12111113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=100;
        while(opcion !=0){
            opcion = Integer.parseInt(
            JOptionPane.showInputDialog(
            "0-Salir\n"
                    + "0-Salir\n"
                    + "1-Crear Familia\n"
                    + "3-Crear alumno\n"
                    + "4-Agregar alumno a clase\n"
                    + "5-Crear Transportista\n"
                    + "6-Crear Transporte"));
            if(opcion==1){
                
            }
        }
    }
    
}
