package com.company.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.company.StudentClass.Student;

public class ToArrayOperation {
    public static void main(String[] args) {
        //Converting stream of strings to array of strings
        Stream<String> stream1 = Stream.of("A", "B", "C", "D");
        String[] arr = stream1.toArray(String[]::new);
        System.out.println(Arrays.toString(arr));

        //Converting an Infinite Stream to an Array
        IntStream infiniteStream = IntStream.iterate(1, i -> i + 1);
        int[] arr1 = infiniteStream.limit(10).toArray();
        System.out.println(Arrays.toString(arr1));

        //To convert a stream of primitives, we must first box the elements in their wrapper classes and then collect the wrapped objects in a collection.
        //This type of stream is called boxed stream.

        //Converting an Infinite Boxed Stream to an Array
        IntStream infiniteNumberStream = IntStream.iterate(1, i -> i + 1);
        Integer[] arr2 = infiniteNumberStream.limit(10).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr2));

        //Stream filter and collect to an Array
        Stream<Student> stream = Stream.of(new Student(1, "Ramires"), new Student(2, "Arnold"), new Student(3, "Kevin"), new Student(4, "Sandra"), new Student(5, "Ajanild"));
        List<Student> list = new ArrayList<>();
        stream.forEach(list::add);
        Student[] employeesArray = list.stream().filter(e -> e.getName().startsWith("A")).toArray(Student[]::new);
        for (Student student : employeesArray) {
            System.out.print(student.getName() + " ");
        }
    }
}