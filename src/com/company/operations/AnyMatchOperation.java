package com.company.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import com.company.StudentClass.Student;

public class AnyMatchOperation {
    public static void main(String[] args) {
        Stream<Student> stream = Stream.of(new Student(1, "Ramires"), new Student(2, "Arnold"), new Student(3, "Kevin"), new Student(4, "Sandra"), new Student(5, "Ajanild"));

        List<String> list = new ArrayList<>();
        stream.forEach(e -> list.add(e.getName()));

        boolean result = list.stream().anyMatch((s) -> s.startsWith("A"));
        System.out.print(result);
    }
}