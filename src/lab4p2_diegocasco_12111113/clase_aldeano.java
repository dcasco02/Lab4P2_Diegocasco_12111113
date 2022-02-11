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
    private int vida;
    private int ataque;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public clase_aldeano(int vida, int ataque, String nombre, String clase, String Apellido, ArrayList<Aldeano> Aldeanos) {
        super(nombre, clase, Apellido, Aldeanos);
        this.vida = vida;
        this.ataque = ataque;
    }
    
    
}
