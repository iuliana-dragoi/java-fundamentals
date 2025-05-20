package src.main.java.Exercises1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//20. Sort objects by attribute using lambda
//Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.
public class Ex20 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Jack", 21));
        students.add(new Student("Marry", 18));
        students.add(new Student("Alan", 26));
        students.add(new Student("Mario", 55));

        students.sort(Comparator.comparing(Student::getAge).reversed());
        students.forEach(System.out::println);
    }
}

class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
