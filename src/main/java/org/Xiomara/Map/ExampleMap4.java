package org.Xiomara.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMap4 {
    public static void main(String[] args) {
        List<Person> lista = Arrays.asList(new Person(1, "Maria", 2000), new Person(2, "Juan", 1200));
        List<Double> incremento = lista.stream()
                .map(person -> person.getSalario() +(person.getSalario() * 0.02))
                .collect(Collectors.toList());
        System.out.println(incremento);
    }
}
