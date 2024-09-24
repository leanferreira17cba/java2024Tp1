package org.entidades;

import ejemplointerface.ContratoSaludo;

public class Bateria extends DispositivoElectronico {

    private int voltajeDeCarga; // (5v, 10v, 15v)
    private int amperaje; // (1, 2 y 5 amperes)
    private int cantidadDeCeldas;
    private char tipoDeCelda;

    public int getCapacidad() {
        return capacidad;
    }

    private int capacidad; //(10, 20, 50, 70 %)

    private int porcentajeDeCargaActual;

    public Bateria(int voltajeDeCarga, int amperaje, int cantidadDeCeldas, char tipoDeCelda, int capacidad, String marca, String modelo, int porcentajeDeCargaActual) {
        super();
        this.voltajeDeCarga = voltajeDeCarga;
        this.amperaje = amperaje;
        this.cantidadDeCeldas = cantidadDeCeldas;
        this.tipoDeCelda = tipoDeCelda;
        this.capacidad = capacidad;
        this.marca = marca;
        this.modelo = modelo;
        this.porcentajeDeCargaActual = porcentajeDeCargaActual;
    }

    public int getPorcentajeDeCargaActual() {
        return porcentajeDeCargaActual;
    }

    public void setPorcentajeDeCargaActual(int porcentajeDeCargaActual) {
        this.porcentajeDeCargaActual = porcentajeDeCargaActual;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "voltajeDeCarga=" + voltajeDeCarga +
                ", amperaje=" + amperaje +
                ", cantidadDeCeldas=" + cantidadDeCeldas +
                ", tipoDeCelda=" + tipoDeCelda +
                ", capacidad=" + capacidad +
                ", porcentajeDeCargaActual=" + porcentajeDeCargaActual +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroDeSerie=" + numeroDeSerie +
                '}';
    }
}
