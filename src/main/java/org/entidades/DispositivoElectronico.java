package org.entidades;

public class DispositivoElectronico {
    protected String marca;
    protected String modelo;
    protected int numeroDeSerie = 1234567;

    public DispositivoElectronico(int numeroDeSerie) {
       this.numeroDeSerie = numeroDeSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public DispositivoElectronico(String modelo) {
        this.modelo = modelo;
    }

    public DispositivoElectronico() {}
}
