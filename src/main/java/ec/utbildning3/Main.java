package ec.utbildning3;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                Stream.of(12, 7, 105, 42, 11)
                        .reduce(0, (a, b) -> a + b)
        );

    }
}
