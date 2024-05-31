package Metodos;

import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args){
    //List<Integer> define lista generica com elementor do tipo Integer ; 
    //numeros: representa a variavel armazenadora da lista;
    //Arrays : classe detentora de metodos estaticos que opera em arrays;
    //asList: metodo estatico do Arrays. Retorna lista imutavel com os elementos fornecidos. Cria uma lista com os inteiros fornecidos.
    //.stream(): converte a lista numeros em fluxo de dados para as proximas operacoes;
    //.sorted()
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    //numeros.stream().sorted(Integer::compareTo).forEach(System.out::println);
    numeros.stream().sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);
    }
}
