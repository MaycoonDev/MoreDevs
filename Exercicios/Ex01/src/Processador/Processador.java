package Processador;

public class Processador {
    private int id;
    private String modelo;
    private int qtdNucleos;
    private double gHz;
    private Marca marca;

    public Processador(int id, String modelo, int qtdNucleos, double gHz, Marca marca) {
        this.id = id;
        this.modelo = modelo;
        this.qtdNucleos = qtdNucleos;
        this.gHz = gHz;
        this.marca = marca;
    }
}
