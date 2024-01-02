// Sort List of Custom Objects using Comparator
// Comparator for Student class
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// Main class
public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Alice"));
        students.add(new Student(1, "Bob"));

        Collections.sort(students, new NameComparator());
        System.out.println("Students sorted by name: " + students);
    }
}
