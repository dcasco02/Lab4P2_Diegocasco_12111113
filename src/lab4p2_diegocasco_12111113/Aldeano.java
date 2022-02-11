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
    private int vida;

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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Aldeano(String nombre, String clase, int vida, String Apellido, ArrayList<Aldeano> Aldeanos) {
        super(Apellido, Aldeanos);
        this.nombre = nombre;
        this.clase = clase;
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Aldeano{" + "nombre=" + nombre + ", clase=" + clase + ", vida=" + vida + '}';
    }
    
}
