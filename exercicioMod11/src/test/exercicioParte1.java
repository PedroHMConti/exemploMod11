package test;

import java.util.*;

public class exercicioParte1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //receber dados
        String nomes = sc.nextLine();

        //colocar dados em uma lista
        List<String>listaDeNomes = Arrays.asList(nomes.split(","));

        //ordenar lista
        Collections.sort(listaDeNomes);

        //imprimir lista ordenada no console
        System.out.println(listaDeNomes);
    }
}
