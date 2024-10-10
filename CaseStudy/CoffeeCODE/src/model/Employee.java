package model;

public class Employee extends Person  {

    private String role;

    public Employee(Person employeeInfo, String role, Account loginInfo) {
        this.role = role;
    }

    public Employee(String role) {
        this.role = role;
    }

    public Employee(String id, String name, String role) {
        super(id, name);
        this.role = role;
    }

    public Employee(String username, String password, boolean status, String id, String name, String role) {
        super(username, password, status, id, name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "role='" + role + " username: "+ getUsername() +
                " password: "+ getPassword() + " Status: "+ isStatus() +
                " id: "+ getId() + " name: "+ getName()  +" }" ;
    }
}
