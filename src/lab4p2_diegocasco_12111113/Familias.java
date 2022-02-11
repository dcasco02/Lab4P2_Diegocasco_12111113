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
    private ArrayList Apellidos;
    private String Apellido;
    private ArrayList <Aldeano> Aldeanos;

    public ArrayList<String> getApellidos() {
        return Apellidos;
    }

    public void setApellidos(ArrayList<String> Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public ArrayList<Aldeano> getAldeanos() {
        return Aldeanos;
    }

    public void setAldeanos(ArrayList<Aldeano> Aldeanos) {
        this.Aldeanos = Aldeanos;
    }

    public Familias(String Apellido, ArrayList<Aldeano> Aldeanos) {
        this.Apellido = Apellido;
        this.Aldeanos = Aldeanos;
    }

    @Override
    public String toString() {
        return "Familias{" + "Apellidos=" + Apellidos + ", Apellido=" + Apellido + ", Aldeanos=" + Aldeanos + '}';
    }

 
    
}
