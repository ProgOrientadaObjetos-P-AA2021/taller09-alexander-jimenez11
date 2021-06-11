/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private String centroEducativo;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(Persona benef, int m, String ciud, String nivel, String centro, double val) {
        super(benef, m, ciud);
        nivelEstudio = nivel;
        centroEducativo = centro;
        valorCarrera = val;
    }

    public void establecerNivelEstudio(String nivel) {
        nivelEstudio = nivel;
    }

    public void establecerCentroEducativo(String centro) {
        centroEducativo = centro;
    }

    public void establecerValorCarrera(double valor) {
        valorCarrera = valor;
    }

    public void establecerValorMensual() {
        double cuota = valorCarrera / obtenerMeses();
        valorMensual = cuota - (cuota * 0.1);
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public String obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        String cadena = "\n< INFORMACIÓN DEL PRÉSTAMO >"
                + "\n----------------------------\n";
        cadena = String.format("%sEstudiante: %s"
                + "\nTiempo de préstamo: %d Meses"
                + "\nCiudad: %s"
                + "\nCentro educativo: %s"
                + "\nNivel de estudio: %s"
                + "\nValor carrera: $%.2f"
                + "\nValor mensual a pagar: $%.2f", cadena, obtenerBeneficiario().
                        obtenerNombre() + " " + obtenerBeneficiario()
                        .obtenerApellido(), obtenerMeses(),
                obtenerCiudad().toUpperCase(), obtenerCentroEducativo(),
                obtenerNivelEstudio(), obtenerValorCarrera(),
                obtenerValorMensual());
        return cadena;
    }
}
