package org.Xiomara.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMap {
    public static void main(String[] args) {
      List<String> names = Arrays.asList("Nico","Xiomara","Geraldine");

      List<String> uppercaseNames = names.stream()
              .map(String::toUpperCase)
              .collect(Collectors.toList());

        System.out.println(uppercaseNames);
    }
}
