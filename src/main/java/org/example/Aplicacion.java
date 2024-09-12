package org.example;

import sms.Sms;

import java.util.Scanner;

public class Aplicacion {

    static String nombreDeLaAplicacion = "Software de carga";

    public static void main(String[] args) {

        System.out.println(nombreDeLaAplicacion);

        Bateria bateriaLitio = new Bateria(5, 1, 100, 'B', 82, "Samsung bat", "BT01", 12);
        Celular samsungS12 = new Celular(bateriaLitio, "usbC", "Samsung", "S12", 123);
        Cargador cargador = new Cargador(5, 1, "usbC", "Keiko", "M49");

        System.out.println(cargador.estaConectado());

        boolean estadoInternoDelCargador = cargador.conectarAlTomaCorriente();

        //cargador.conectarAlTomaCorriente();

        String respuesta = "Su telefono ";
        respuesta += (estadoInternoDelCargador) ? "esta conectado" : "no esta conectado";

        System.out.println(respuesta);

        /*System.out.println(samsungS12.marca);
        System.out.println(bateriaLitio.marca);
        System.out.println(samsungS12.numeroDeSerie);*/

        cargador.conectarAlCelular(samsungS12);

        try {
            //cargador.cargar();
        } catch (Exception e) {

        }

        Bateria bateria1 = ingresarPorConsolaValoresParaInstanciarUnaBateria();

        System.out.println(bateria1.toString());

        // ejemplo de static context
        //Aplicacion.ingresarPorConsola();

        // ejemplo de modificadores de visibilidad
        //Sms sms = new Sms();
        //DispositivoElectronico dispositivoElectronico = new DispositivoElectronico();

    }

    public static Bateria ingresarPorConsolaValoresParaInstanciarUnaBateria() {
        int voltajeDeCarga, amperaje, cantidadDeCeldas, capacidad, porcentajeDeCargaActual;
        char tipoDeCelda;
        String marca, modelo;

        // Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese voltaje de carga (5v, 10v, 15v): ");
        voltajeDeCarga = scanner.nextInt();

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
}