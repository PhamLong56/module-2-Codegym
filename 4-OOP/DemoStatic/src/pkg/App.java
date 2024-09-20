public class App {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Nam");
        Student s2 = new Student(2,"Quan");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(Student.getSchool());

        Student.Account st1 = new Student.Account("admin","1234567");
        System.out.println(st1);
    }



}
