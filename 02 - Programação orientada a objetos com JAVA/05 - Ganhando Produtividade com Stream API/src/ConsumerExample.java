import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*Representa um operacao que aceita um argumento de do tipo T e nao retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do
 * Stream sem modificar ou retornar um valor.
 */

public class ConsumerExample {
    public static void main(String[] args) {
        //criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // usar o Consumer com expressão lambda para imprimir os números
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };


        // Usar o Consumer para imprimir os números pares
        numeros.stream().forEach(n -> {
                if(n % 2 == 0) {
                    System.out.println(n);
                }
            }
        );
    }

}
