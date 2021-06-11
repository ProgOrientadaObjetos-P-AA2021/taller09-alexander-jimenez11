/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int meses;
    protected String ciudad;

    public Prestamo(Persona benef, int m, String ciud) {
        beneficiario = benef;
        meses = m;
        ciudad = ciud;
    }

    public void establecerBeneficiario(Persona benef) {
        beneficiario = benef;
    }

    public void establecerMeses(int m) {
        meses = m;
    }

    public void establecerCiudad(String ciud) {
        ciudad = ciud;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerMeses() {
        return meses;
    }

    public String obtenerCiudad() {
        return ciudad;
    }
}
