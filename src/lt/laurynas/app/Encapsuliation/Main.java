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

        Person personInfo = new Person();
        personInfo.setName(name);
        personInfo.setLastName(lastName);
        personInfo.setAge(age);
        System.out.println("Person name is " + personInfo.getName() + " last name is " + personInfo.getLastName() + " and he is " + personInfo.getAge()+" years old");
    }
}

class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(){

    };

    public Person(String n, String ln, int a){
        this.name = n;
        this.lastName = ln;
        this.age = a;
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

}
