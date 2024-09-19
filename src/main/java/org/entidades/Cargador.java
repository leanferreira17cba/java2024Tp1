package org.entidades;

import static java.lang.Thread.sleep;

public class Cargador extends DispositivoElectronico {

    public int voltajeDeCarga; //(5v, 10v, 15v)
    public int amperaje; //(1, 2 y 5 amperes)
    public String tipoDeFicha; //(usbC, lightning, microUsb)
    //public porcentaje de carga por segundo y amperaje
    public boolean conectado = false;
    public Celular celular;

    public Cargador(int voltajeDeCarga, int amperaje, String tipoDeFicha, String marca, String modelo) {
        super();
        this.voltajeDeCarga = voltajeDeCarga;
        this.amperaje = amperaje;
        this.tipoDeFicha = tipoDeFicha;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Cargador(int voltajeDeCarga, String tipoDeFicha, String marca, String modelo, int amperaje) {
        super(99);
        this.voltajeDeCarga = voltajeDeCarga;
        this.amperaje = amperaje;
        this.tipoDeFicha = tipoDeFicha;
        this.marca = marca;
        this.modelo = modelo;
    }

    public boolean conectarAlTomaCorriente() {
        setConectado(true);
        return this.conectado;

        // return conectado = true;
    }

    @Override
    public String toString() {
        return "Cargador{" +
                "voltajeDeCarga=" + voltajeDeCarga +
                ", amperaje=" + amperaje +
                ", tipoDeFicha='" + tipoDeFicha + '\'' +
                ", conectado=" + conectado +
                ", celular=" + celular +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroDeSerie=" + numeroDeSerie +
                '}';
    }

    public boolean estaConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    /*
    -
    - desconectarDelCelular
    */

    public void conectarAlCelular(Celular celular) {
        this.celular = celular;
    }

    public void cargar() throws InterruptedException {

        // break   continue
        for (int y = celular.getBateriaInterna().getPorcentajeDeCargaActual(); y <= celular.getBateriaInterna().getCapacidad(); y++) {
            sleep(50);
            System.out.println("Carga actual: " + celular.getBateriaInterna().getPorcentajeDeCargaActual() + " %");
            celular.getBateriaInterna().setPorcentajeDeCargaActual(y + 1);
        }

        // Se animan a modelar una barra de carga que tenga la misma cantidad de simbolos que porcentaje cargado?
        // seria algo asi
        System.out.print("Cargando su dispositivo ");
        for (int y = 1; y <= 100; y++) {
            sleep(500);
            System.out.print("*");
        }

    }

}
