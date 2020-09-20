package lt.laurynas.app.masives;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String[] cars = {"Audi", "BMW", "MB", "Lexus", "Volvo", "Opel", "Ford", "VW", "KIA", "Jeep"};

        for(int i = 0; i< cars.length; i++){
            System.out.println(cars[i]);
        }
        System.out.println("******************************");

        int j = 0;
        while(j<cars.length){
            System.out.println(cars[j]);
            j++;
        }
        System.out.println("**************************************");
        for(String k : cars){
            System.out.println(k);
        }

        // Scanner scan = new Scanner(System.in);

        // System.out.println("Enter size of the arr: ");
        // int size = scan.nextInt();
        // scan.nextLine();
        // String[] values = new String[size];
        //
        // System.out.println("Enter the elements of the arr: ");
        // for(int m = 0; m < values.length; m++){
        //     values[m] = scan.nextLine();
        // }
        //
        // System.out.println("Contents of arr is: " + Arrays.toString(values));

        System.out.println("*************************************");

        int[] numbers = {7, 45, 56, 8, 22, 21};
        int total = 0;
        for(int l = 0; l<numbers.length; l++){
            total+=numbers[l];
        }
        System.out.println(total);                        //sum of the arr

        System.out.println("*************************************");

        int ave = total/numbers.length;                    //average array number

        System.out.println(ave);

        System.out.println("******************************************");

        int[] intArr = { 4, 1, 2, 0, 6, 7 };
        int iterations = 0;
        int changins = 0;
        System.out.println("Prieš rikiavimą: " + Arrays.toString(intArr));
        for (int u = 0; u < intArr.length - 1; u++) {
            int beforeSorting = intArr[u];
            System.out.println("Prieš rikiavimą " + beforeSorting);
            for(int c = 0; c < intArr.length - 1; c++){
                iterations++;
                if(intArr[c] > intArr[c + 1]){
                    int temporary = intArr[c + 1];
                    intArr[c + 1] = intArr[c];
                    intArr[c] = temporary;
                    changins++;
                }
            }
        }
        System.out.println("Po rikiavimo: " + Arrays.toString(intArr));
        System.out.println("Iteracijos "+ iterations);
        System.out.println("Pasikeitimai: " + changins);

    }
}
