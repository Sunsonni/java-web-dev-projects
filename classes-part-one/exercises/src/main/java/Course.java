import java.util.HashMap;
import java.util.Objects;

public class Course {
    private String courseName;
    private int classLimit;
    private HashMap<Integer, Student> students = new HashMap<>();
    int nextId = 0;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", classLimit=" + classLimit +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return classLimit == course.classLimit && Objects.equals(courseName, course.courseName) && Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, classLimit, students);
    }
}
