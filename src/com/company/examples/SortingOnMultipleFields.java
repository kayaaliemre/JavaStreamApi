package com.company.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.company.StudentClass.Student;

public class SortingOnMultipleFields {
    public static void main(String[] args) {

        Stream<Student> stream = Stream.of(new Student(1, "Ramires"), new Student(2, "Arnold"), new Student(3, "Kevin"), new Student(4, "Sandra"), new Student(5, "Ajanild"));
        List<Student> list = new ArrayList<>();
        stream.forEach(list::add);

        //sorting by name and then sorting by ID
        Comparator<Student> compareByName = Comparator
                .comparing(Student::getName).thenComparing(Student::getID);

        List<Student> sortedStudents = list.stream()
                .sorted(compareByName).collect(Collectors.toList());
        System.out.println(sortedStudents);
    }
}