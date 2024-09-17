package org.vates;

import org.entidades.Bateria;
import org.entidades.Cargador;
import org.entidades.Celular;

import java.util.Scanner;

public class Aplicacion {

    static String nombreDeLaAplicacion = "Software de carga de bateria y diagnostico";

    public static void main(String[] args) {

        System.out.println(nombreDeLaAplicacion);

        Bateria bateria = ingresarPorConsolaValoresParaInstanciarUnaBateria();
        Celular celular = ingresarPorConsolaValoresParaInstanciarUnCelular();
        Cargador cargador = ingresarPorConsolaValoresParaInstanciarUnCargador();

        //TODO: crear una base de datos para estos artefactos. De manera que haya una persistencia. List, Arrays, Maps.


        /*TODO Revisar si los datos ingresados son correctos y lanzar exception
          TODO Revisar si los datos son correctos y continuar ejecucion informando al usuario pero sin detener el flujo de la app
        */
    }

    public static Bateria ingresarPorConsolaValoresParaInstanciarUnaBateria() {
        int voltajeDeCarga, amperaje, cantidadDeCeldas, capacidad, porcentajeDeCargaActual;
        char tipoDeCelda;
        String marca, modelo;

        // Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese voltaje de carga (5v, 10v, 15v): ");

        int valorDeVoltajeIngresadoPorConsola = 0;

        boolean flag = true;

        try {
            int u = 7 / 1;
        } catch (ArithmeticException ae) {
            System.out.println("catchee");
            //enviar un reporte
            //declarar variables

        } finally {
            System.out.println("Ejecute el finally");
        }

        while (flag) {
            valorDeVoltajeIngresadoPorConsola = scanner.nextInt();

            if (valorDeVoltajeIngresadoPorConsola == 5 || valorDeVoltajeIngresadoPorConsola == 10 || valorDeVoltajeIngresadoPorConsola == 15) {
                // TODO: agregar los valores de 10 y 15
                System.out.println("El valor ingresado es incorrecto. Debe ser: 5, 10 o 15. Se ingreso: " + valorDeVoltajeIngresadoPorConsola);
            } else {
                flag = false;
            }
        }

        voltajeDeCarga = valorDeVoltajeIngresadoPorConsola;

        System.out.print("Ingrese amperaje (1, 2 y 5 amperes): ");
        amperaje = scanner.nextInt();

        System.out.print("Ingrese cantidad de celdas: ");
        cantidadDeCeldas = scanner.nextInt();

        System.out.print("Ingrese capacidad en porcentaje: ");
        capacidad = scanner.nextInt();

        System.out.print("Ingrese porcentaje de carga actual: ");
        porcentajeDeCargaActual = scanner.nextInt();

        System.out.print("Ingrese tipo de celda (A, B, C): ");
        tipoDeCelda = scanner.next().charAt(0);

        System.out.print("Ingrese marca: ");
        marca = scanner.next();

        System.out.print("Ingrese modelo: ");
        modelo = scanner.next();

        return new Bateria(voltajeDeCarga, amperaje, cantidadDeCeldas, tipoDeCelda, capacidad, marca, modelo, porcentajeDeCargaActual);
    }

    public static Celular ingresarPorConsolaValoresParaInstanciarUnCelular() {
        Bateria bateria = null;
        int numeroDeSerie;
        String tipoDeFicha, marca, modelo;

        System.out.println(Integer.MAX_VALUE);

        // Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese numero de serie: ");
        numeroDeSerie = scanner.nextInt();

        System.out.print("Ingrese tipo de ficha (usbC, lightning, microUsb): ");
        tipoDeFicha = scanner.next();

        System.out.print("Ingrese marca: ");
        marca = scanner.next();

        System.out.print("Ingrese modelo: ");
        modelo = scanner.next();

        return new Celular(bateria, tipoDeFicha, marca, modelo, numeroDeSerie);
    }

    public static Cargador ingresarPorConsolaValoresParaInstanciarUnCargador() {
        int voltajeDeCarga, amperaje;
        String tipoDeFicha, marca, modelo;

        // Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese voltaje de carga (5v, 10v, 15v): ");
        voltajeDeCarga = scanner.nextInt();

        System.out.print("Ingrese amperaje (1, 2 y 5 amperes): ");
        amperaje = scanner.nextInt();

        System.out.print("Ingrese tipo de ficha (usbC, lightning, microUsb): ");
        tipoDeFicha = scanner.next();

        System.out.print("Ingrese marca: ");
        marca = scanner.next();

        System.out.print("Ingrese modelo: ");
        modelo = scanner.next();

        return new Cargador(voltajeDeCarga, amperaje, tipoDeFicha, marca, modelo);
    }
}