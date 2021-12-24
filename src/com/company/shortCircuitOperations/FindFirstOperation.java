package com.company.shortCircuitOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.company.StudentClass.Student;

public class FindFirstOperation {
    public static void main(String[] args) {
        Stream<Student> stream = Stream.of(new Student(1, "Ramires"), new Student(2, "Arnold"), new Student(3, "Kevin"), new Student(4, "Sandra"), new Student(5, "Ajanild"));

        List<String> list = new ArrayList<>();
        stream.forEach(e -> list.add(e.getName()));

        //get & store in a string and print value
        String firstMatchedName = list.stream().filter((s) -> s.startsWith("S")).findFirst().get();
        System.out.println(firstMatchedName);

        //Sequential Stream - returns first element
        Stream<String> stream1 = list.stream();
        stream1.findFirst().ifPresent(System.out::println);

        //Parallel stream -> returns random element
        Stream<String> stream2 = list.stream();
        stream2.parallel().findFirst().ifPresent(System.out::println);
    }
}