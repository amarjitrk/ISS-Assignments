// Collections: List, Set, and Map
import java.util.*;

// Class representing a Student
class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

public class CollectionExample {
    public static void main(String[] args) {
        // List of Students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(2, "Alice"));
        studentList.add(new Student(1, "Bob"));

        // Sorting list of Students
        Collections.sort(studentList);
        System.out.println("Sorted List: " + studentList);

        // Set of Students
        Set<Student> studentSet = new HashSet<>(studentList);

        // Map of Student to Student (demonstration purpose)
        Map<Student, Student> studentMap = new HashMap<>();
        for (Student s : studentList) {
            studentMap.put(s, s);
        }

        System.out.println("Student Map: " + studentMap);
    }
}
