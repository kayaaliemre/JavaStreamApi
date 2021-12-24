package com.company.operations;

import java.util.stream.Stream;

import com.company.StudentClass.Student;

public class LimitOperation {
    public static void main(String[] args) {
        Stream<Student> stream = Stream.of(new Student(1, "Ramires"), new Student(2, "Arnold"), new Student(3, "Kevin"), new Student(4, "Sandra"), new Student(5, "Ajanild"));

        //limits to only first n values from the stream
        stream.limit(3).forEach(e -> System.out.print(e.getName() + " "));

        //Note: limit() works only on streams and not on any other collections
    }
}