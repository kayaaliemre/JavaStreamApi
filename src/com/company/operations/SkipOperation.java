package com.company.operations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.company.StudentClass.Student;

public class SkipOperation {
    public static void main(String[] args) {
        Stream<Student> stream = Stream.of(new Student(1, "Ramires"), new Student(2, "Arnold"), new Student(3, "Kevin"), new Student(4, "Sandra"), new Student(5, "Ajanild"));

        //skip() is used to skip n elements and print the remaining
        System.out.println("Stream 1 => ");
        stream.skip(2).forEach( e -> System.out.println(e.getName() + " "));

        Stream<Student> stream2 = Stream.of(new Student(1, "Ramires"), new Student(2, "Arnold"), new Student(3, "Kevin"), new Student(4, "Sandra"), new Student(5, "Ajanild"));

        //we can also skip elements and limit in the remaining to print
        //it skips 2 elements and print the next 1 element only
        List<Student> newList = stream2.skip(2).limit(1).toList();
        System.out.println("Stream 2 => ");
        for (Student student : newList) {
            System.out.println(student.getName() + " ");
        }
    }
}