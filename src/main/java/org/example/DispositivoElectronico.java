package org.example;

public class DispositivoElectronico {
    public String marca;
    public String modelo;
    public int numeroDeSerie = 1234567;

    public DispositivoElectronico(int numeroDeSerie) {
       this.numeroDeSerie = numeroDeSerie;
    }

    public DispositivoElectronico(String modelo) {
        this.modelo = modelo;
    }

    public DispositivoElectronico() {}
}
