package org.example;

public class Aplicacion {
    public static void main(String[] args) {

        Bateria bateriaLitio = new Bateria(5, 1, 100, 'B', 100, "Samsung bat", "BT01", 1);
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
        cargador.cargar();

    }
}