package lesson5;

public class MainApp {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivan", "Ivanovich", "Ivanov", "iviviv@yandex.ru", "engineer", "89019011234", 40000, 30);
        employeesArray[1] = new Employee("Pyotr", "Petrovich", "Petrov", "ppp@yandex.ru", "engineer", "89019017890", 30000, 35);
        employeesArray[2] = new Employee("Ilya", "Ilyich", "Ilyin", "ililil@yandex.ru", "operator", "89019087654", 25000, 46);
        employeesArray[3] = new Employee("Victor", "Petrovich", "Golubev", "vpg@yandex.ru", "senior engineer", "89019123456", 50000, 40);
        employeesArray[4] = new Employee("Anna", "Ivanovna", "Ivanova", "ani@yandex.ru", "accountant", "89019876543", 35000, 43);

        for (int i =0; i<employeesArray.length; i++) {
            if (employeesArray[i].getAge()>=40) {
                employeesArray[i].employeeToString();
            }
        }
    }
}
