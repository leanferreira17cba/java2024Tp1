package org.entidades;

public class Celular extends DispositivoElectronico {

    private Bateria bateriaInterna;
    public String tipoDeFicha; // (usb C, lightning, micro usb)

    @Override
    public String toString() {
        return "Celular{" +
                "bateriaInterna=" + bateriaInterna +
                ", tipoDeFicha='" + tipoDeFicha + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroDeSerie=" + numeroDeSerie +
                '}';
    }

    public Celular(Bateria bateriaInterna, String tipoDeFicha, String marca, String modelo, int numeroDeSerie) {
        super();
        this.bateriaInterna = bateriaInterna;
        this.tipoDeFicha = tipoDeFicha;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Bateria getBateriaInterna() {
        return bateriaInterna;
    }
}
