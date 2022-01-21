package ec.utbildning4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        class Employee {
            String name;
            int age;
            int salary;

            public Employee(String name, int age, int salary) {
                this.name = name;
                this.age = age;
                this.salary = salary;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            public int getSalary() {
                return salary;
            }

            @Override
            public String toString() {
                return "Employee{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", salary=" + salary +
                        '}';
            }
        }

        List<Employee> employees = List.of(
                new Employee("Anna", 21, 21000),
                new Employee("Börje", 65, 18000),
                new Employee("Hugo", 45, 32000),
                new Employee("Kerstin", 4, 1500),
                new Employee("Anders", 58, 50200)
        );

        employees
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .sorted(Comparator.comparing(Employee::getAge))
                .limit(2)
                .skip(1)
                .forEach(System.out::println);
    }
}
