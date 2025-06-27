import java.util.Random;

public class BolasGolf {

    int numeroSerie;
    String material;
    double raio;
    String cor;

    BolasGolf(){
        this.numeroSerie = new Random().nextInt(1000,10000);
        this.material = "Poliesteno";
    }
    public void mostrarDados(){
        System.out.println("Numero Serie: " + this.numeroSerie+"\nMaterial: " + this.material +"\nRaio: " + this.raio+"\nCor: " + this.cor);
    }
}
