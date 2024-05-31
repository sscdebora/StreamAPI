package Metodos;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //mapToInt converte elementos stream em fluxo de inteiros primitivos, int
        //Integer::intValue o mesmo que (Integer i) -> i.intValue() . Caixa com brinquedo -> abrir/pegar brinquedo p usar  
        int soma = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(soma);
        
    }
    
}
