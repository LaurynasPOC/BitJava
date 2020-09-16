package lt.laurynas.app.IfStatements;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = y.nextInt();

        if(age<0 || age>125){
            System.out.println("Enter valid age");
        } else if (age < 18){
            System.out.println("You can not vote.");
        } else if(age>45){
            System.out.println("You can vote and stands as candidate.");
        } else if(age>18){
            System.out.println("You can vote my friend.");
        }
    }
}
