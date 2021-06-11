/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipo;
    private String marca;
    private Persona garante;
    private double valor;
    private double valor_mensual;

    public PrestamoAutomovil(Persona benef, int m, String ciud, String tip, String marc, Persona garant, double val) {
        super(benef, m, ciud);
        tipo = tip;
        marca = marc;
        garante = garant;
        valor = val;
    }

    public void establecerTipo(String tip) {
        tipo = tip;
    }

    public void establecerMarca(String mar) {
        marca = mar;
    }

    public void establecerGarante(Persona garan) {
        garante = garan;
    }

    public void establecerValor(double val) {
        valor = val;
    }

    public void establecerValor_mensual() {
        valor_mensual = valor / obtenerMeses();
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante() {
        return garante;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerValor_mensual() {
        return valor_mensual;
    }

    @Override
    public String toString() {
        String cadena = "\n< INFORMACIÓN DEL PRÉSTAMO >"
                + "\n----------------------------\n";
        cadena = String.format("%sBeneficiario: %s"
                + "\nTiempo de préstamo: %d Meses"
                + "\nCiudad: %s"
                + "\nGarante: %s"
                + "\nTipo: %s"
                + "\nMarca: %s"
                + "\nValor automovil: $%.2f"
                + "\nValor mensual a pagar: $%.2f", cadena, obtenerBeneficiario()
                        .obtenerNombre() + " " + obtenerBeneficiario()
                        .obtenerApellido(), obtenerMeses(), obtenerCiudad()
                        .toLowerCase(), obtenerGarante().obtenerNombre()
                + " " + obtenerGarante().obtenerApellido(), obtenerTipo(),
                obtenerMarca(), obtenerValor(), obtenerValor_mensual());

        return cadena;
    }
}
