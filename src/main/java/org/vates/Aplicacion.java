package org.vates;

import bd.BaseDeDatos;
import org.entidades.Bateria;
import org.entidades.Cargador;
import org.entidades.Celular;
import org.entidades.DispositivoElectronico;

import java.util.Scanner;

public class Aplicacion {

    static String nombreDeLaAplicacion = "Software de carga de bateria y diagnostico";

    public static void main(String[] args) {

        System.out.println(nombreDeLaAplicacion);

        BaseDeDatos baseDeDatos = new BaseDeDatos();

        for (int y = 0; y < 100; y++) {
            Bateria bateria = new Bateria(5, 2, 34, 'A', 45, "Sam", "GT5", 3);//ingresarPorConsolaValoresParaInstanciarUnaBateria();
            Celular celular = new Celular(bateria, "usbC", "Kim", "ER4", 3453453);//ingresarPorConsolaValoresParaInstanciarUnCelular(bateria);
            Cargador cargador = new Cargador(5, 2, "usbC", "KIL", "AA"); //ingresarPorConsolaValoresParaInstanciarUnCargador();

            baseDeDatos.setDispositivoElectronico(bateria);
            baseDeDatos.setDispositivoElectronico(celular);
            baseDeDatos.setDispositivoElectronico(cargador);
        }

            int posicion = 0;

            for (DispositivoElectronico dispositivo : baseDeDatos.getInstancia()) {
                System.out.print("Elemento en posicion " + ++posicion + " - ");
                System.out.println(dispositivo.toString());
            }

            Scanner scanner = new Scanner(System.in);

            System.out.print("Elija la posicion del elemento que quiere recuperar: ");
            int posicionElegida = scanner.nextInt();
            System.out.println("Dispositivo en la posicion " + posicionElegida + " : " + baseDeDatos.getDispositivoElectronico(posicionElegida - 1));
            System.out.println("Cantidad de elementos de la instancia: " + baseDeDatos.getTamanoDeInstancia());
            baseDeDatos.eliminarElemento(posicion);

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

        /*try {
            int u = 7 / 1;
        } catch (ArithmeticException ae) {
            System.out.println("catchee");
            //enviar un reporte
            //declarar variables

        } finally {
            System.out.println("Ejecute el finally");
        }*/

        while (flag) {
            valorDeVoltajeIngresadoPorConsola = scanner.nextInt();

            if (valorDeVoltajeIngresadoPorConsola == 5 || valorDeVoltajeIngresadoPorConsola == 10 || valorDeVoltajeIngresadoPorConsola == 15) {
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

    public static Celular ingresarPorConsolaValoresParaInstanciarUnCelular(Bateria bateria) {
        int numeroDeSerie;
        String tipoDeFicha, marca, modelo;

        //System.out.println(Integer.MAX_VALUE);

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