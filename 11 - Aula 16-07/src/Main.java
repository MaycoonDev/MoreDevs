import Ex01.Pessoa;
import Atv01.Peixe;
import Atv02.Aluno;
import Atv03.Ingresso;
import Atv03.Portador;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Pessoa pessoa = new Pessoa();
//        pessoa.id = 1;
//        pessoa.nome = "Maycon";
//        pessoa.idade = 18;
//        pessoa.altura = 1.75;
//
//        Pessoa pessoa2 = new Pessoa(2,"maycon",21,1.88);
//        System.out.println(pessoa2.id);
//        Peixe peixe = new Peixe();
//        peixe.id = new Random().nextInt(999);
//        peixe.especie = "Palhaço";
//        peixe.grupo = "cartilaginosos";
//        peixe.peso = 30.2;
//        peixe.comprimento = 0.7;
//
//        System.out.println("Id: "+peixe.id+"\nEspecie: "+peixe.especie+"\nGrupo: "+peixe.grupo+"\nPeso: "+peixe.peso+"\nComprimento: "+peixe.comprimento);

//        Aluno aluno = new Aluno();
//        aluno.setId(1);
//        aluno.setMatricula(144633);
//        aluno.setNome("Maycon");
//        aluno.setN1(7.0);
//        aluno.setN2(8.0);
//        aluno.setN3(9.0);
//
//        System.out.println("Matricula: "+aluno.getMatricula()+"\nAluno: "+aluno.getNome()+"\nMedia: "+ aluno.getMedia());

        Scanner scan = new Scanner(System.in);
        Ingresso ingresso = new Ingresso();

        System.out.println("Bem vindo ao Sistema, Cadastre seus ingresso!");
        System.out.println("Digite o Lote: ");
        ingresso.setLote(scan.nextInt());
        System.out.println("Digite o numero do Ingresso: ");
        ingresso.setNumeroIngresso(scan.nextInt());
        System.out.println("Digite o valor do Ingresso: ");
        ingresso.setValor(scan.nextDouble());
        System.out.println("Digite o nome do Evento: ");
        ingresso.setEvento(scan.next());
        System.out.println("Digite o dia do Evento: ");
        scan.nextLine();
        ingresso.setData(scan.next());
        System.out.println("Digite o cantor do Evento: ");
        ingresso.setCantor(scan.next());
        System.out.println("Digite o Nome do portador: ");
        String portador = scan.nextLine();
        ingresso.setPortador(portador);
        System.out.println("Segue as informações do seu ingresso\nId: "+ingresso.getId()+"\nLote: "+ingresso.getLote()+"\nNumero de ingressos: "+ ingresso.getNumeroIngresso()+"\nNome do evento: "+ ingresso.getEvento()+"\nCantor do evento: "+ ingresso.getCantor()+"\nDia do evento: "+ ingresso.getData()+"\nValor: "+ingresso.getValor()+"Nome do Portador: "+ingresso.getPortador());
    }
}