import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static ArrayList<String> palavrasCertas = new ArrayList<>();
    static ArrayList<String> palavrasAle = new ArrayList<>();
    static ArrayList<String> musicas = new ArrayList<>();
    static Random random = new Random();
    static ArrayList<String> alunos = new ArrayList<>();
    static ArrayList<String> palavras = new ArrayList<>();
    static ArrayList<String> itensComprados = new ArrayList<>();
    static ArrayList<String> listaCompras = new ArrayList<>();
    static ArrayList<String> nomes = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException{

        String op = "";

        while (true) {
            System.out.println("1 - ATV1\n2 - ATV2\n3 - ATV3\n4 - ATV4\n5 - ATV5\n6 - ATV6");

            op = scan.next();
            if (op.equals("1")) {
                while (true) {
                    System.out.println("\n0 - SAIR\n1 - CADASTRAR NOMES\n2 - EXIBIR NOMES\n3 - REMOVER NOME PELO INDEX\n");
                    op = scan.next();

                    if (op.equals("0")) break;

                    switch (op) {
                        case "1":
                            cadNome();
                            break;
                        case "2":
                            exbNomes();
                            break;
                        case "3":
                            remNome();
                            break;
                        default:
                            break;
                    }
                }
            }
            if (op.equals("2")) {
                while (true) {
                    System.out.println("\n0 - SAIR\n1 - CADASTRAR NA LISTA\n2 - EXIBIR LISTA\n3 - CLASSIFICAR COMO COMPRADO\n");
                    op = scan.next();

                    if (op.equals("0")) break;

                    switch (op) {
                        case "1":
                            cadCompras();
                            break;
                        case "2":
                            exbCompras();
                            break;
                        case "3":
                            confCompra();
                            exbComprados();
                            break;
                        default:
                            break;
                    }
                }
            }
            if (op.equals("3")) {
                cadPalavras();
            }
            if (op.equals("4")) {
                while (true) {
                    System.out.println("\n0 - SAIR\n1 - CADASTRAR ALUNOS\n2 - SORTEAR ALUNOS\n");
                    op = scan.next();

                    if (op.equals("0")) break;

                    switch (op) {
                        case "1":
                            cadAlunos();
                            break;
                        case "2":
                            sorteioAlunos();
                            break;
                        default:
                            break;
                    }
                }
            }
            if (op.equals("5")){
                while (true) {
                    System.out.println("\n0 - SAIR\n1 - CADASTRAR MUSICAS\n2 - ORGANIZAR MUSICAS\n3 - EXIBIR MUSICAS\n");
                    op = scan.next();

                    if (op.equals("0")) break;

                    switch (op) {
                        case "1":
                            cadMusica();
                            break;
                        case "2":
                            orgMusica();
                            break;
                        case "3":
                            exbMusicas();
                            break;
                        default:
                            break;
                    }
                }
            }
            if (op.equals("6")){

                    palvrasAleatorias();

            }
        }
    }

    public static void cadNome(){
        System.out.println("DIGITE O NOME QUE VOCE QUER ADICIONAR: ");
        String nome = scan.next();
        nomes.add(nome);
    }
    public static void exbNomes(){
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i+" - "+nomes.get(i));
        }
        System.out.println("\n");
    }
    public static void remNome(){
        System.out.println("DIGITE O INDICE QUE VOCE QUER REMOVER: ");
        int index = scan.nextInt();
        nomes.remove(index);
    }

    public static void cadCompras(){
        System.out.println("\nDIGITE O ITEM PARA ADICIONAR NA LISTA DE COMPRAS: ");
        String item = scan.next();
        listaCompras.add(item);
    }
    public static void exbCompras(){
        System.out.println("\nLISTA DE COMPRAS\n");
        for (int i = 0; i < listaCompras.size(); i++) {
            System.out.println(i+"."+listaCompras.get(i));
        }
    }
    public static void confCompra(){
        exbCompras();
        System.out.println("\nDIGITE O INDICE DO ITEM COMPRADO: ");
        int item = scan.nextInt();
        itensComprados.add(listaCompras.get(item));
        listaCompras.remove(item);
    }
    public static void exbComprados(){
        System.out.println("\nITENS JÁ COMPRADOS\n");
        for (int i = 0; i < itensComprados.size(); i++) {
            System.out.println(i+"."+itensComprados.get(i));
        }
    }

    public static void cadPalavras(){
        String palavra = "";
        int contador = 0;
        System.out.println("\nDIGITE AS PALAVRAS: (fim PARA O PROGRAMA)\n");
        while(true){

            palavra = scan.next();
            if (palavra.equals("fim")) break;
            palavras.add(palavra);
        }
        for (int i = 0; i < palavras.size(); i++) {
            contador ++;
            System.out.println(palavras.get(i));
        }
        System.out.println("\nFORAM DIGITADAS "+contador+" Palavras.\n");
    }

    public static void cadAlunos(){
        System.out.println("\nDIGITE O NOME DOS ALUNOS: ");
        String nome = scan.next();
        alunos.add(nome);
    }
    public static void sorteioAlunos(){
        int aluno = random.nextInt(alunos.size());
        System.out.println("ALUNO SORTEADO: "+alunos.get(aluno));
    }

    public static void cadMusica(){
        System.out.println("CADASTRE SUAS 5 MUSICAS FAVORITAS: ");
        String musica = "";
        for (int i = 0; i < 5; i++) {
            musica = scan.next();
            musicas.add(musica);
        }
    }
    public static void orgMusica(){
        System.out.println("DIGITE A ATUAL POSIÇÃO MUSICA QUE VOCE QUER ALTERAR A POSIÇÃO");
        int posicaoAtual = scan.nextInt();

        System.out.println("\nDIGITE A NOVA POSIÇÃO DESSA MUSICA");
        int posicaoNova = scan.nextInt();

        String musicaAtual = musicas.get(posicaoAtual);
        musicas.set(posicaoAtual,musicas.get(posicaoNova));
        musicas.set(posicaoNova,musicaAtual);
    }
    public static void exbMusicas(){
        for (int i = 0; i < musicas.size(); i++) {
            System.out.println(i+" - "+musicas.get(i));
        }
    }

    public static void palvrasAleatorias() throws InterruptedException {

        palavrasAle.add("A");
        palavrasAle.add("B");
        palavrasAle.add("C");
        palavrasAle.add("D");
        palavrasAle.add("E");

        for (int i = 0; i < palavrasAle.size(); i++) {
            System.out.println(palavrasAle.get(i));

        }
        Thread.sleep(5000);
        for (int i = 0; i < 20; i++) {
            System.out.println("\n");

        }
        for (int i = 0; i < palavrasAle.size(); i++) {


        }



    }

}