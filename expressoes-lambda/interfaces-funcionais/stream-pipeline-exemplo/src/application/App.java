package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        System.out.println();

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()   // transforma em Stream
                .filter(x -> x % 2 == 0)        // filtra todos os valores pares
                .map(x -> x * 10)               // multiplica os valores por 10
                .collect(Collectors.toList());  // transforma no tipo List

        System.out.println(Arrays.toString(newList.toArray()));

    }

}
