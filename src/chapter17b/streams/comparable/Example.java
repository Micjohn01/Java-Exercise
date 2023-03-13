package chapter17b.streams.comparable;

import java.util.Set;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        Set<Employee> employees = Set.of(
                new Employee("Michael", 20),
                new Employee("John", 30),
                new Employee("Oluwadamipe", 40)
        );

        System.out.println(employees);

        System.out.println(employees.stream()
                .sorted()
                .collect(Collectors.toList()));
    }
}
