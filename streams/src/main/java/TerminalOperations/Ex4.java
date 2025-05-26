package main.java.TerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex4 {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Jason"));
        employees.add(new Employee("Alex"));
        employees.add(new Employee("Mark"));
        employees.add(new Employee("Dan"));

        Set<String> set = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toSet());
        System.out.println(set);
    }

    static class Employee {

        String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
