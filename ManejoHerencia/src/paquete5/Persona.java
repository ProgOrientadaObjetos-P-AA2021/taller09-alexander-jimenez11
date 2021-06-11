/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author Alexander
 */
public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String n, String a) {
        nombre = n;
        apellido = a;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }
}
