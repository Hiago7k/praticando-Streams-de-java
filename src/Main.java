import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args){
        // LeetCode #1
//        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5,6);
//
//        numeros.stream()
//                        .filter(n -> n % 2 == 0)
//                        .sorted()
//                .forEach(System.out::println);

        // LeetCode #2
        //2 - Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.
        List<String> palavras = Arrays.asList("java", "stream", "lambda");
//
//        palavras.stream()
//                .map(p -> p.toUpperCase())
//                .forEach(System.out::println);


        // LeetCode #3
        /*
        3 - Dada a lista de números inteiros abaixo,
         filtre os números ímpares, multiplique cada um por 2 e colete os resultados
          em uma nova lista.
        */

//        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
//        System.out.println("Lista original");
//        numeros.forEach(System.out::println);
//
//        System.out.println("Números imps após a stream");
//       List<Integer> resultado = numeros.stream()
//                .filter(n ->  n % 2 > 0)
//                .map(n -> n * 2)
//               .collect(Collectors.toList());
//        System.out.println(resultado);


        // LeetCode #4
        /*
        4 - Dada a lista de strings abaixo, remova as duplicatas
         (palavras que aparecem mais de uma vez) e imprima o resultado.
         */
//        List<String> palavrasDup = Arrays.asList("apple", "banana", "apple", "orange", "banana");
//            palavrasDup.stream()
//                    .sorted().distinct()
//                    .forEach(System.out::println);

        /*
        5 - Dada a lista de sublistas de números inteiros abaixo,
         extraia todos os números primos em uma única lista e os ordene em ordem crescente.
         */
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );


        listaDeNumeros.forEach(System.out::println);
    }
}