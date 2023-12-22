package ex06;

class Employee1 {
    public int baseSalary = 3000000; // 기본급
    int getSalary() {
        return baseSalary;
    }
}

class Manager extends Employee1{
    @Override
    int getSalary() {
        return (baseSalary + 2000000);
    }
}

class Programmer extends Employee1 {
    @Override
    int getSalary() {
        return (baseSalary + 3000000);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자의 월급: " + obj1.getSalary());

        Programmer obj2 = new Programmer();
        System.out.println("프로그래머의 월급: " + obj2.getSalary());
    }
}
