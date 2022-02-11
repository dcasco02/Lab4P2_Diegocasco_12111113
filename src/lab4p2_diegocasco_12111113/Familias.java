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
public class Familias {
    private ArrayList <String> Apellido;
    private ArrayList Aldeanos;

    public ArrayList<String> getApellido() {
        return Apellido;
    }

    public void setApellido(ArrayList<String> Apellido) {
        this.Apellido = Apellido;
    }

    public ArrayList getAldeanos() {
        return Aldeanos;
    }

    public void setAldeanos(ArrayList Aldeanos) {
        this.Aldeanos = Aldeanos;
    }

    public Familias(ArrayList<String> Apellido, ArrayList Aldeanos) {
        this.Apellido = Apellido;
        this.Aldeanos = Aldeanos;
    }
    
}
