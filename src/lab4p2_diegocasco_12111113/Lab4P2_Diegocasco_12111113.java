/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_diegocasco_12111113;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dcasc
 */
public class Lab4P2_Diegocasco_12111113 {
    private clase_aldeano a=new clase_aldeano();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r=new random();
        ArrayList Familias = new ArrayList();
        int opcion=100;
        while(opcion !=0){
            opcion = Integer.parseInt(
            JOptionPane.showInputDialog(
                            "0-Salir\n"
                            + "1-Crear Familia\n"
                            + "2- Crear Aldeano\n"
                            + "3-Imprimir Familais\n"
                            + "4-Pelear"));
            if(opcion==1){
                String apellido=JOptionPane.showInputDialog("Ingrese el Apellido: ");
                Familias.add(new Familias(apellido, Familias));
            }if(opcion==2){
                String nombre=JOptionPane.showInputDialog("Ingrese el Nombre: ");
                String apellido=JOptionPane.showInputDialog("Ingrese el Apellido: ");
                 int vida=Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese los anos de experiencia: "));
                 Familias.add(new Aldeano(nombre, nombre, vida, apellido, Familias));
                 JOptionPane.showInputDialog(
                       "0-Salir\n"
                    + "1-Normales\n"
                    + "2-Pacicifista\n"
                    + "3-Herero\n"
                    + "4-Agronomo\n"
                    + "5-Explosivo\n"
                    + "6-Supergranjero");
                 if(opcion==1){
                     clase_aldeano.setAtaque(50);
                 }if (opcion==2){
                     clase_aldeano.setAtaque(0);
                 }if(opcion==3){
                     clase_aldeano.setAtaque(350);
                 }if(opcion==4){
                     clase_aldeano.setAtaque(100);
                 }if(opcion==5){
                     clase_aldeano.setAtaque(250);
                 }if(opcion==6){
                     clase_aldeano.setAtaque(1000);
                 }
            }if(opcion==3){
                String salida="";
                for(Object temp: Familias){
                    if(temp instanceof Familias){
                        salida=""+Familias.indexOf(temp)+" -"+ temp+"\n";
                    }
                }
                JOptionPane.showMessageDialog(null,salida);
            }if(opcion==4){
                
            }
        }
    }
    
}
