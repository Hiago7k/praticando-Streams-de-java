import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args){
        // LeetCode #1
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5,6);

        numeros.stream()
                        .filter(n -> n % 2 == 0)
                        .sorted()
                .forEach(System.out::println);
        
    }
}