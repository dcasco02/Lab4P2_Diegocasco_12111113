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
public class Aldeano extends Familias{
    private String nombre;
    private String clase;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Aldeano(String nombre, String clase, String Apellido, ArrayList<Aldeano> Aldeanos) {
        super(Apellido, Aldeanos);
        this.nombre = nombre;
        this.clase = clase;
    }
    
}
