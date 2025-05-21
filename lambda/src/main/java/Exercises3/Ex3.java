package src.main.java.Exercises3;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//3.Combine two lists of Employee and group them by department.
//Create an Employee(String name, String department) class. Use a BiFunction<List<Employee>, List<Employee>, Map<String, List<Employee>>> that returns a map grouping employees by their department.
public class Ex3 {

    public static void main(String[] args) {

        List<Employee> employeeList1 = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "Finance")
        );

        List<Employee> employeeList2 = List.of(
                new Employee("Diana", "IT"),
                new Employee("Eve", "HR"),
                new Employee("Frank", "Finance")
        );

        BiFunction<List<Employee>, List<Employee>, Map <String, List<Employee>>> groupEmployeeByDepartment = (list1, list2)-> {
            return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.groupingBy(Employee::getDepartment));
        };

        Map<String, List<Employee>> group = groupEmployeeByDepartment.apply(employeeList1, employeeList2);
        group.forEach((department, employees) -> { System.out.println("Department: " + department + " employees: " + employees); });
    }

    static class Employee {

        String name;
        String department;
        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }
    }
}
