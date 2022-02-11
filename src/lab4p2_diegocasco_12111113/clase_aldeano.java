/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_diegocasco_12111113;

import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class clase_aldeano extends Aldeano {
    private int ataque;

    clase_aldeano() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public clase_aldeano(int ataque, String nombre, String clase, int vida, String Apellido, ArrayList<Aldeano> Aldeanos) {
        super(nombre, clase, vida, Apellido, Aldeanos);
        this.ataque = ataque;
    }
    


    
}
