package Metodos;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //allMatch verifica se os elementos atendem ao predicado/expressao lambda fornecido
        boolean positivos = numeros.stream().allMatch(n -> n > 0);
        System.out.println(positivos);

    }
}
