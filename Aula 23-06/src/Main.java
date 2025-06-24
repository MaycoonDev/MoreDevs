import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> produtos = new HashMap<>();

        ArrayList<String> nomes = new ArrayList<>();
        produtos.put("Pacote de arroz", 7.80);
        produtos.put("Feijoada congelada", 18.99);
        produtos.put("Porco inteiro", 120.50);
        System.out.println(produtos.get("Pacote de arroz"));

        HashMap<Integer, Integer> tamanhoCalcado = new HashMap<>();
        tamanhoCalcado.put(7,36);
        tamanhoCalcado.put(8,37);
        tamanhoCalcado.put(8,39);
        tamanhoCalcado.put(9,41);
        System.out.println(tamanhoCalcado.get(8));

        //SEPARAR ITENS
        HashMap<Integer, String> definicao = new HashMap<>();
        definicao.put(1,"Limpeza");
        definicao.put(2,"Mantimentos");
        definicao.put(3,"Frios");
        definicao.put(4,"Carnes");
        System.out.println(definicao.get(8));

        //CONTOLE DE ESTOQUE
        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Arroz",100);
        estoque.put("Feijão",40);
        estoque.put("Picanha",60);
        estoque.put("Sabão",10);
        System.out.println(estoque.get("Arroz"));

        //CONTOLE DE ESTOQUE
        HashMap<String, Point> cordenadas = new HashMap<>();
        cordenadas.put("Bluemanu", new Point(10,29));
        cordenadas.put("Itajai",new Point(11,30));
        cordenadas.put("Gaspar",new Point(12,31));
        cordenadas.put("Brusque",new Point(13,32));
        System.out.println(cordenadas.get("Blumenau"));

    }
}