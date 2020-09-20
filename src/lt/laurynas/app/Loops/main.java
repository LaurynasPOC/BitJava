package lt.laurynas.app.Loops;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int num = 5;
        for(int i =6; i<num; i++){   //never will be inicialized
            System.out.println("Try again!");
        }
        // for(int i = 0; i<num; i--){   //
        //     System.out.println("Help me?!"); //Endless loop
        // }

        // Scanner sc = new Scanner(System.in);
        // String userInput = null;
        // String quiz = "q";
        // do {
        //     System.out.print("Can you quess correct letter?");
        //     userInput = sc.nextLine();
        // } while(!userInput.equals(quiz));
        // System.out.println("Finally you found correct letter!");

        // Scanner reverseStr = new Scanner(System.in); // print reverse
        // System.out.print("Input a string: ");
        // char[] letters = reverseStr.nextLine().toCharArray();
        // System.out.print("Reverse string: ");
        // for (int h = letters.length - 1; h >= 0; h--) {
        //     System.out.print(letters[h]);
        // }
        // System.out.print("\n");

        String myString;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string.");
        myString = scan.nextLine();

        for (char c : myString.toCharArray()) {

            System.out.println(c);
        }

    }
}
