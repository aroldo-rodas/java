package entities;

import java.util.List;

public class Print <T> {
    public static void print(List<?> lista) {
        lista.forEach(System.out::println);
    }
}
