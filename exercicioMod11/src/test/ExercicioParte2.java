package test;

import dominio.Pessoa;

import java.util.*;

public class ExercicioParte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();


        //lista para armazenar dados do tipo pessoa
        List<Pessoa> pessoas = new ArrayList<>();

        //lista de homens
        List<String>homens = new ArrayList<>();

        //lista de mulheres
        List<String>mulheres = new ArrayList<>();

        //seprando a string(nome-sexo)
        List<String>p = Arrays.asList(entrada.split(","));
        //separando nome e sexo
        for (int i = 0; i < p.size(); i++) {
            List<String> a = Arrays.asList(p.get(i).split("-"));
            Pessoa pessoa = new Pessoa(a.get(0),a.get(1));
            pessoas.add(pessoa);
        }
        //separando homens e mulheres
        for (int i = 0; i < pessoas.size(); i++) {
            if(pessoas.get(i).getSexo().equals("H")){
                homens.add(pessoas.get(i).getNome());
            } else if (pessoas.get(i).getSexo().equals("M")) {
                mulheres.add(pessoas.get(i).getNome());
            }
        }
        //ordenando ambas listas
        Collections.sort(homens);
        Collections.sort(mulheres);
        //imprimindo no console
        System.out.println("Lista de homens: "+ homens);
        System.out.println("Lista de mulheres: "+ mulheres);
    }
}
