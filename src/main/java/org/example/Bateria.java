package org.example;

public class Bateria extends DispositivoElectronico {

    public int voltajeDeCarga; // (5v, 10v, 15v)
    public int amperaje; // (1, 2 y 5 amperes)
    public int cantidadDeCeldas;
    public char tipoDeCelda;
    public int capacidad; //(10, 20, 50, 70 %)

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
}
