package org.Xiomara.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleFilter1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Valentina","Nicole","Xiomara","Alejandra");

        List<String> filteredNames = names.stream()
                .filter(name-> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);

    }
}
