package model;

public class Student {
    private String name;
    private int id;
    private static String school = "CG";

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "model.Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", school='" + school + '\'' +
                '}';
    }

    public static String getSchool() {
        return school;
    }

    public static class Account {
        private String username;
        private String password;

        public Account(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

    }
}

