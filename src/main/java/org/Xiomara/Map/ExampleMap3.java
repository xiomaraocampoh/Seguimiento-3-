package org.Xiomara.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMap3 {
    public static void main(String[] args) {

    List<Person> people = Arrays.asList(new Person(01,"Nicolás",100000),new Person(02,"geraldine",980000));
    List<String> names = people.stream()
            .map(person -> person.getName().toUpperCase())
            .collect(Collectors.toList());

        System.out.println(names);
    }
}
