package Atv03;
import Portador;

import java.util.Random;

public class Ingresso {

    private int id = new Random().nextInt(9999);
    private int lote;
    private int numeroIngresso;
    private String evento;
    private String cantor;
    private String local;
    private String data;
    private double valor;
    private Portador portador;

    public int getId() {
        return id;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getNumeroIngresso() {
        return numeroIngresso;
    }

    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public Portador getPortador() {
        return portador;
    }
    public void setPortador(String portador) {
        this.portador.setNome(portador);
    }
}
