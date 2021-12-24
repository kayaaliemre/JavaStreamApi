package com.company.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import com.company.StudentClass.Student;

public class PeekOperation {
    public static void main(String[] args) {
        Stream<Student> stream = Stream.of(new Student(1, "Ramires"), new Student(2, "Arnold"), new Student(3, "Kevin"), new Student(4, "Sandra"), new Student(5, "Ajanild"));

        List<String> list = new ArrayList<>();
        stream.forEach(e -> list.add(e.getName()));

        //peek() returns a new Stream consist of elements from the original Stream

        //using peek() without terminal operation -> prints nothing
        //list.stream().peek(System.out::println);

        //using peek() with terminal operation
        List<String> newList = list.stream()
                .peek(System.out::println).collect(Collectors.toList());
        System.out.println(newList);

        //Stream.peek() method can be useful in visualizing how the stream operations behave and understanding the implications and interactions of complex intermediate stream operations
    }
}