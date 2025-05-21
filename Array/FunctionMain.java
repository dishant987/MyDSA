
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Function<String, Integer> f2 = x -> x.length();
        Function<String, String> f4 = x -> x.substring(0, 3);
        Function<List<Student>, List<Student>> s1 = l1 -> {
            List<Student> list = new ArrayList<>();
            for (Student student : l1) {
                if (f4.apply(student.getName()).equalsIgnoreCase("dis")) {
                    list.add(student);
                }
            }
            return list;

        };

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dishant"));
        students.add(new Student(2, "Disha"));
        students.add(new Student(3, "Dishan"));
        students.add(new Student(4, "Dish"));
        students.add(new Student(5, "Dis"));
        students.add(new Student(6, "Dinesh"));
        students.add(new Student(7, "Divya"));
        students.add(new Student(8, "Diksha"));
        students.add(new Student(9, "Dimple"));
        students.add(new Student(10, "Dhiraj"));

        System.out.println(s1.apply(students));

    }

    private static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "'}";
        }
    }
}
