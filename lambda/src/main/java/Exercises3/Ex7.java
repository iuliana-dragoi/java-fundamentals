package src.main.java.Exercises3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

//7.Group a list of students by their grade using HashMap and BiConsumer. Create a Student class with name and grade.
//Group students by their grade in a HashMap. Use a BiConsumer to insert students into the map.
public class Ex7 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Jack", 6));
        students.add(new Student("Tom", 6));
        students.add(new Student("Rachel", 5));
        students.add(new Student("Michael", 6));

        HashMap<Integer, List<Student>> grouped = new HashMap<>();
        BiConsumer<Integer, Student> addStudent = (grade, student) -> {
            grouped.computeIfAbsent(grade, v -> new ArrayList<>()).add(student);
        };

        students.forEach(student -> addStudent.accept(student.getGrade(), student));
        grouped.forEach((grade, list) -> {
            System.out.println(grade + ": " + list);
        });

        //Version2
        Map<Integer, List<Student>> groupedByGrade = students.stream().collect(Collectors.groupingBy(Student::getGrade));
        groupedByGrade.forEach((grade, list) -> {
            System.out.println(grade + ": " + list);
        });
    }

    static class Student {

        String name;
        int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }

}
