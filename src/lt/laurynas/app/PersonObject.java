package lt.laurynas.app;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PersonObject {
    public static void main(String[] args) {

        Scanner personData = new Scanner(System.in);

        System.out.println("Enter person name: ");
        String name = personData.nextLine();

        System.out.println("Enter person surname: ");
        String surname = personData.nextLine();

        System.out.println("Enter person age: ");
        int age = personData.nextInt();

        Person personInfo = new Person();
        personInfo.setName(name);
        personInfo.setSurname(surname);
        personInfo.setAge(age);
        System.out.println("Vardas: " + personInfo.getName());
        System.out.println("Pavardė: " + personInfo.getSurname());
        System.out.println("Amžius: " + personInfo.getAge());
    }
}



class Person {
    String name;
    String surname;
    int age;
    public void setName(String name){
        this.name = name;
    }
    public  void setSurname(String surname){
        this.surname = surname;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }
    public int getAge(){
        return this.age;
    }
}
