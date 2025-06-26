import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //cria a instancia scanner que permite a inserção de dados pelo o usuario
        Scanner scan = new Scanner(System.in);
        exLoopFor(scan);
    }

    public static void exLoopFor(Scanner scan){
        //i = interador
        //no começo verifica e no final soma
        //cria um vetor inteiro com 4 casas
        int[] numeros = new int[4];

        //imprime os cadastro de casa do vetor de acordo com o tamanho dele
        for (int i = 0; i < numeros.length; i++) {
            //define numeros aleatorios para cada casa
            numeros[i] = new Random().nextInt(11);
            System.out.println(numeros[i]);
        }
    }

    public static void exLoopWhile(Scanner scan){
        int contador = 0;

        //cria um loop com uma regra
        //while nao tem limite de repetição, enquanto for tem
        //compara string VARIAVEL.equals()
        while (contador < 10 ){
            System.out.println(contador);
            contador++;
        }

        //caso de montar um MENU
        while(true){
            System.out.println("1-oi\n2-tchau\n0-sair");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("oi");
                    break;
                case 2:
                    System.out.println("tchau");
                    break;
                case 0:
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("opçao invalida");
                    break;
            }
            if (op == 0){
                break;
            }
        }
    }

    public static void exMediaLista(Scanner scan) {
        //cria uma lista e define o tipo dela dentro do generic
        ArrayList<Double> notas = new ArrayList<>();

        //solicita para que o usuario informe as listas
        System.out.println("Digite quatro notas: ");
        notas.add(scan.nextDouble());
        notas.add(scan.nextDouble());
        notas.add(scan.nextDouble());
        notas.add(scan.nextDouble());

        //calcula a media das notas e imprime o resultado
        double media = (notas.get(0) + notas.get(1)+ notas.get(2) + notas.get(3)) / 4;
        System.out.println("A media é: "+media);

        //separando o fluxograma do codigo com IF e ELSE
        if (media >= 10.0){
            System.out.println("Aluno passou de ano com media 10!");
        }
        else if (media >= 7.0){
            System.out.println("Aluno passou de ano");
        }
        else{
            System.out.println("Aluno reprovou");
        }

        //if e else basico em uma linha
        System.out.println(media >= 7? "aprovado": "reprovado");
    }

    public static void exMediaVetor(Scanner scan) {
        //cria um vetor e define o valor para cada espaço dele
        double[] notas = new double[4];
        System.out.println("Digite 4 notas: ");
        notas[0] = scan.nextDouble();
        notas[1] = scan.nextDouble();
        notas[2] = scan.nextDouble();
        notas[3] = scan.nextDouble();

        //calcula a media das notas e imprime o resultado
        double media = (notas[0] + notas[1]+ notas[2] + notas[3]) / 4;
        System.out.println("A media é: "+media);
    }

    public static void exMediaVariaveis(Scanner scan) {
        //Solicita para que o usuario digite quatro notas e armazena cada uma em uma variavel
        System.out.println("Digite quatro notas: ");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();

        //calcula a media das notas e imprime o resultado
        double media = (n1 + n2 + n3 + n4) / 4 ;
        System.out.println("A media é: "+media);
    }

    public static void exArea(Scanner scan){
        //Solicita que o usuario informe o raio do circulo no qual ele quer saber a area e salva na variavel RAIO
        System.out.println("qual o raio do circulo: ");
        double raio = scan.nextDouble();

        //Pode ser usado o Math.pow() para calcular um numero elevado a ele mesmo, nomeclatura (numero,quantas vezes elevado a ele mesmo)
        //calcula a area do circulo e imprime o resultado para o usuario
        double area = Math.PI * (raio * raio);
        System.out.println("a area do circulo é: " + area);
    }

    public static void exemplos(Scanner scan){
        //solicita ao usuario que digite seu nome e guarda na variavel NOME
        System.out.println("Qual seu nome: ");
        String nome = scan.next();

        //imprime uma mmensagem de bem vindo ao usuario juntando a variavel de NOME
        System.out.println("Bem vindo, " + nome);

        //solicita ao usuario que digite sua idade e guarda na variavel IDADE
        System.out.println("Qual sua idade: ");
        int idade = scan.nextInt();

        //Imprime a idade do usuario dizendo a ele quantos anos ele tem
        System.out.println("Você tem " + idade + " anos");

        //solicita ao usuario que digite um numero de sua escolha QUANDO FOR FEITO CALCULOS UTILIZAR A VARIAVEIS DOUBLE
        System.out.println("Digite um numero: ");
        double a1 = scan.nextDouble();

        //solicita ao usuario que digite outro numero de sua escola
        System.out.println("Digite outro numero: ");
        double a2 = scan.nextDouble();

        //faz a soma, subtração, multiplicação e divisão dos numeros que o usuario escolheu
        double soma = a1 + a2;
        double sub = a1 - a2;
        double mult = a1 * a2;
        double div = a1 / a2;

        //imprime os resultados
        System.out.println("resultado da soma: " + soma);
        System.out.println("resultado da subtração: " + sub);
        System.out.println("resultado da multiplicação: " + mult);
        System.out.println("resultado da divisão: " + div);
    }
}