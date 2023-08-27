package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student(1, "John Arnold", LocalDate.of(1980, 1, 21)),
                new Student(2, "Smith Tod", LocalDate.of(1970, 2, 22)),
                new Student(3, "Harry Parker", LocalDate.of(1975, 3, 22)),
                new Student(4, "Peter Parker", LocalDate.of(2012, 4, 23)),
                new Student(5, "Anna White", LocalDate.of(2018, 5, 23)),
                new Student(6, "Marry Lane", LocalDate.of(1978, 6, 24)),
                new Student(7, "Britney Terry", LocalDate.of(1972, 7, 25)),
                new Student(8, "Sam Pat", LocalDate.of(2022, 8, 26)),
                new Student(9, "Donald Jackson", LocalDate.of(2023, 9, 27)),
                new Student(10, "Lebron James", LocalDate.of(2023, 10, 28))
        );
        printListOfStudents(studentList);
        getListOfPlatinumAlumniStudents(studentList);
    }

    private static void printListOfStudents(List<Student> studentList) {
        System.out.println("List of admitted student with name in ascending order.\n");
        studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);
    }

    private static void getListOfPlatinumAlumniStudents(List<Student> studentList) {
        System.out.println("\nList of platinumAlumni Students with descending order of date of admission.\n");
        studentList.stream()
                .filter(student -> student.getDateOfAdmission().isBefore(LocalDate.now().minusYears(30)))
                .sorted(Comparator.comparing(Student::getDateOfAdmission).reversed())
                .forEach(System.out::println);
    }
}
