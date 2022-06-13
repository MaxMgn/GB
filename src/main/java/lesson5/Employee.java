package lesson5;

public class Employee {

    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String jobTitle;
    private String phone;
    private int salary;
    private int age;

    public Employee(String firstName, String middleName, String lastName, String email, String jobTitle, String phone, int salary, int age){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void employeeToString(){
        System.out.println("firstName: " + firstName + ", middleName: " + middleName + ", lastName: " + lastName + ", email: " + email + ", jobTitle: " + jobTitle + ", phone: " + phone + ", salary: " + salary + ", age: " +  age);

    }
}
