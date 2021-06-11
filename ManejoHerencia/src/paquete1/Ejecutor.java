/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        while (opc != 3) {
            System.out.println("\n    *** MENU ***");
            System.out.println("1. PRÉSTAMO AUTOMOVIL");
            System.out.println("2. PRÉSTAMO EDUCATIVO");
            System.out.println("3. SALIR");
            System.out.print("\nSELECCIONE UNA OPCIÓN: ");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("\n\t<< PRÉSTAMO DE AUTOMOVIL >>");
                    System.out.println("\t===========================");
                    System.out.println("** DATOS DEL BENEFICIARIO **");
                    System.out.print("NOMBRE: ");
                    String nombreb = sc.nextLine();
                    System.out.print("APELLIDO: ");
                    String apellidob = sc.nextLine();
                    System.out.print("MESES PRÉSTAMO: ");
                    int mesesb = sc.nextInt();
                    sc.nextLine();
                    System.out.print("CIUDAD: ");
                    String ciudadb = sc.nextLine();
                    System.out.println("\n** DATOS DEL GARANTE **");
                    System.out.print("NOMBRE: ");
                    String nombreg = sc.nextLine();
                    System.out.print("APELLIDO: ");
                    String apellidog = sc.nextLine();
                    System.out.println("\n** DATOS DEL AUTOMOVIL **");
                    System.out.print("TIPO: ");
                    String tipo = sc.nextLine();
                    System.out.print("MARCA: ");
                    String marca = sc.nextLine();
                    System.out.print("VALOR AUTOMOVIL: ");
                    double valor = sc.nextDouble();

                    Persona benef = new Persona(nombreb, apellidob);
                    Persona garante = new Persona(nombreg, apellidog);
                    PrestamoAutomovil prestamo1 = new PrestamoAutomovil(benef, mesesb, ciudadb, tipo, marca, garante, valor);
                    prestamo1.establecerValor_mensual();
                    System.out.println(prestamo1);
                    break;
                case 2:
                    System.out.println("\n\t<< PRÉSTAMO DE EDUCATIVO >>");
                    System.out.println("\t===========================");
                    System.out.println("** DATOS DEL ESTUDIANTE **");
                    System.out.print("NOMBRE: ");
                    String nombreE = sc.nextLine();
                    System.out.print("APELLIDO: ");
                    String apellidoE = sc.nextLine();
                    System.out.print("MESES PRÉSTAMO: ");
                    int mesesE = sc.nextInt();
                    sc.nextLine();
                    System.out.print("CIUDAD: ");
                    String ciudadE = sc.nextLine();
                    System.out.print("NIVEL EDUCATIVO: ");
                    String nivel = sc.nextLine();
                    System.out.print("CENTRO EDUCATIVO: ");
                    String centro = sc.nextLine();
                    System.out.print("VALOR CARRERA: ");
                    double valorcarrera = sc.nextDouble();
                    Persona est = new Persona(nombreE, apellidoE);
                    PrestamoEducativo prestamo2 = new PrestamoEducativo(est, mesesE, ciudadE, nivel, centro, valorcarrera);
                    prestamo2.establecerValorMensual();
                    System.out.println(prestamo2);
                    break;
                case 3:
                    System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA!!");
                    break;
                default:
                    System.out.println("OPCIÓN INCORRECTA, INGRESE DE NUEVO:");
                    break;
            }
        }

    }

}
