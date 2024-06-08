
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*Representa um operacao que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample {
    public static void main(String[] args) {
        //Usar Supplier com expressão lambda para frornecer uma saudacao personalizada
        Supplier<String> saudacao = () -> "Olá, Mundo!";

        //usar Supplier para fornecer uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, Mundo!")
                .limit(5)
                .toList();

        //imprimir a lista de saudações
        listaSaudacoes.forEach(System.out::println);
    }
}
