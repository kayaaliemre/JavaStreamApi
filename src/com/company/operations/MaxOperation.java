package com.company.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.company.StudentClass.Student;

public class MaxOperation {
    public static void main(String[] args) {
        //largest element in the stream with lambda expression
        List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        Optional<Integer> maxNumber1 = list1.stream().max(Comparator.naturalOrder());
        System.out.println(maxNumber1.get());


        //largest element in the stream with Comparator
        List<Integer> list2 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        Comparator<Integer> maxComparator = Integer::compareTo;
        Optional<Integer> maxNumber2 = list2.stream().max(maxComparator);
        System.out.println(maxNumber2.get());


        //largest string of Student class stream
        Stream<Student> stream = Stream.of(new Student(1, "Ramires"), new Student(2, "Arnold"), new Student(3, "Kevin"), new Student(4, "Sandra"), new Student(5, "Ajanild"));
        List<String> list = new ArrayList<>();
        stream.forEach(e -> list.add(e.getName()));
        Comparator<String> comparator = String::compareTo;
        Optional<String> maxString = list.stream().max(comparator);
        System.out.println(maxString.get());
    }
}