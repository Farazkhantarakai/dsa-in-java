package org.example.Java8;

import java.util.Collections;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicatePractice {
  public static void main(String[] args) {
//    String[] names = { "faraz", "adnan", "faisal" };
    // Collections.sort(names, (a,b) -> a.compareTo(b));
    Function<String, String> function = String::toUpperCase;
//    System.out.println(function.apply("Farazkhan"));
    Function<String, String> function2 = x -> x.substring(0,3);
//    System.out.println(function2.apply("farazkhan"));
//    Function<List<Student>,List<Student>> studentWithFar= it -> {
//List<Student> newStudent=new ArrayList<>();
//      for(Student student:it){
//        if(function2.apply(student.getName()).equalsIgnoreCase("far")){
//          newStudent.add(student);
//        }
//      }
//      return newStudent;
//    };
//    Student s1=new Student(1,"farazkhan");
//    Student s2=new Student(2,"fareed");
//    Student s3=new Student(3,"farzand");
//List<Student>  students= Arrays.asList(s1,s2,s3);
//List<Student> filteredStudents=  studentWithFar.apply(students);
//    filteredStudents.forEach(student -> System.out.println(student.getName()));
    System.out.println(function.andThen(function2).apply("Hello"));



  }
}
