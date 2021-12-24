package com.company.operations;

import java.util.ArrayList;

import com.company.StudentClass.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectOperation {
    public static void main(String[] args) {
        Stream<Student> stream = Stream.of(new Student(1, "Ramires"), new Student(2, "Arnold"), new Student(3, "Kevin"), new Student(4, "Sandra"), new Student(5, "Ajanild"));

        List<String> list = new ArrayList<>();
        stream.forEach(e -> list.add(e.getName()));

        List<String> namesInUppercase = list.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.print(namesInUppercase);
    }
}