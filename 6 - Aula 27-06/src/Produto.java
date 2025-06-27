import java.util.Random;
import java.util.Scanner;

public class Produto {
    static Scanner scan = new Scanner(System.in);
    public String nome;
    public String categoria;
    public int quantidade;
    public double preco;
    public double valorEmEstoque;

    public Produto(){
        this.quantidade = new Random().nextInt(10,100);
        this.preco = new Random().nextDouble(5.0,200.0);
        this.valorEmEstoque = quantidade * preco;
    }
    public void imprimir(){
        System.out.println("Nome: "+this.nome+"\nCategoria: "+this.categoria+"\nQuantidade: "+this.quantidade+"\nPreço: "+String.format("%.2f",this.preco)+"\nValor em Estoque: "+String.format("%.2f",this.valorEmEstoque));
    }
    public void diminuiEstoque(){
        System.out.println("DIGITE A QUANTIDADE: ");
        int qtd = scan.nextInt();
        if (qtd>this.quantidade){
            System.out.println("QUANTIDADE INDISPONIVEL");
        }else {
            this.quantidade -= qtd;

            System.out.println("QUANTIDADE ALTERADA COM SUCESSO");
            this.valorEmEstoque = quantidade * preco;
        }
        imprimir();
    }
}
