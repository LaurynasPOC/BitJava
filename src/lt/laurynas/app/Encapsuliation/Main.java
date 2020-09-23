package lt.laurynas.app.Encapsuliation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter person name: ");
        String name = sc.nextLine();

        System.out.println("Enter person last name: ");
        String lastName = sc.nextLine();

        System.out.println("Enter person age: ");
        int age = sc.nextInt();

        System.out.println("Enter person salary: ");
        int salary = sc.nextInt();

        sc.close();

        Person personInfo = new Person();
        personInfo.setName(name);
        personInfo.setLastName(lastName);
        personInfo.setAge(age);
        personInfo.setSalary(salary);
        System.out.println("Person name is " + personInfo.getName() + " last name is " + personInfo.getLastName() + " he is " + personInfo.getAge()+" years old and he earns " + personInfo.getSalary());
    }
}

class Person {
    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person(){

    };

    public Person(String n, String ln, int a, int sal){
        this.name = n;
        this.lastName = ln;
        this.age = a;
        this.salary=sal;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
