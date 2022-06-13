package lesson5;

public class Employee {

    private String name;
    private String patronym;
    private String surname;
    private String email;
    private String jobTitle;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String patronym, String surname, String email, String jobTitle, String phone, int salary, int age){
        this.name = name;
        this.patronym = patronym;
        this.surname = surname;
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
        System.out.println("Name: " + name + ", patronym: " + patronym + ", surname: " + surname + ", email: " + email + ", jobTitle: " + jobTitle + ", phone: " + phone + ", salary: " + salary + ", age: " +  age);

    }
}
