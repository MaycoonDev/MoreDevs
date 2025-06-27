import java.util.Random;
import java.util.Scanner;

public class ContaBancaria {
    static Scanner scan = new Scanner(System.in);
    public int numero;
    public String titular;
    double saldo;

    public ContaBancaria(){
        this.numero = new Random().nextInt(9999);
    }
    public void depositar(){
        System.out.println("Digite o valor a depositar: ");
        double deposito = scan.nextDouble();
        if(deposito>=0){
            this.saldo += deposito;
            exbConta();
        }else System.out.println("Deposito invalido");
    }
    public void sacar(){
        System.out.println("Digite o valor a sacar: ");
        double valor = scan.nextDouble();
        if(valor>=0){
            if(this.saldo>=valor){
                this.saldo -= valor;
                exbConta();
            }else System.out.println("Saldo insuficiente");
        }else System.out.println("Valor invalido");
    }
    public void exbConta(){
        System.out.println("Numero da conta: " + this.numero+"\nTitular: "+this.titular+"\nSaldo: "+String.format("%.2f",this.saldo));
    }

}
