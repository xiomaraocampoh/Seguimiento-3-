package org.Xiomara.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMap2 {
    public static void main(String[] args) {
        List<Integer> Numbers = Arrays.asList(5,10,15);

        List<Integer> doble = Numbers.stream()
                .map(x-> x * x)
                .collect(Collectors.toList());

        System.out.println(doble);
    }
}
