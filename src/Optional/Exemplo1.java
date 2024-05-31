package Optional;

import java.util.Optional;

public class Exemplo1 {
    public static void main(String[] args) {
        // of(value): Cria um Optional contendo o valor fornecido. Se o valor for nulo,
        // lançará uma exceção NullPointerException.
        // Optional<String> optionalValue = Optional.of("Hello");
        // System.out.println(optionalValue.get());

        // ofNullable(value): Cria um Optional contendo o valor fornecido, mas permite
        // que o valor seja nulo.
        // String nullableValue = null;
        // Optional<String> optionalValue = Optional.ofNullable(nullableValue);
        // System.out.println(optionalValue.isPresent());

        // orElse(defaultValue): Obtém o valor contido no Optional, ou retorna um valor
        // padrão se o Optional estiver vazio
        // Optional<String> optionalValue = Optional.ofNullable(null);
        // String result = optionalValue.orElse("Default");
        // System.out.println(result);

        // orElseGet(supplier): Obtém o valor contido no Optional, ou retorna um valor
        // fornecido por um Supplier se o Optional estiver vazio.
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElseGet(() -> "Value from Supplier");
        System.out.println(result);

    }

}
