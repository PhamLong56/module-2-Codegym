import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
       if (o1.getAge() > o2.getAge()) return 1;
       else if (o1.getAge() < o2.getAge()) return -1;
       else return 0;
    }

    public static void main(String[] args) {
        Student student = new Student("Kien",30,"HT");
        Student student1 = new Student("Nam",26,"HN");
        Student student2 = new Student("Anh",38,"HT");
        Student student3 = new Student("Tung",38,"HT");

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        Collections.sort(studentList, new AgeComparator());
        for (Student s : studentList) {
            System.out.println(s.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        System.out.println("So sanh theo tuoi: ");
        Collections.sort(studentList, ageComparator);
        for (Student s : studentList) {
            System.out.println(s.toString());
        }
    }
}
