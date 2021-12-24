package com.company.examples;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.company.StudentClass.Student;

public class MergingCustomObjects {
    public static void main(String[] args) {

        Stream<Student> stream1 = Stream.of(new Student(1, "Ramires"), new Student(2, "Arnold"), new Student(3, "Kevin"), new Student(4, "Sandra"), new Student(5, "Ajanild"));
        Stream<Student> stream2 = Stream.of(new Student(6, "Raguram"), new Student(7, "Arun"), new Student(8, "KavinKumar"), new Student(9, "Sam"), new Student(10, "Akash"));
        Stream.concat(stream1, stream2)
                .filter(distinctByKey(Student::getName)).forEach(e -> System.out.print(e + " "));

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}