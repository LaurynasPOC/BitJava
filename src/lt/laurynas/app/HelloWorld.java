package lt.laurynas.app;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE - 1); //underflow
        System.out.println(Integer.MAX_VALUE + 1); //overflow

        int i = 5;
        int j = 2;

        System.out.println("i is " + i);
        System.out.println("j is " + j);

        int k = i % j;
        // System.out.println("i%j is " + k);
        // float result = 2 / 0;
        // System.out.println(result);
        // int x = 10;
        // int y = 5;
        // System.out.println(x == 10 && y <= 5); //true
        // System.out.println(x <= y && y > 5); // false
        // System.out.println(„abc” instanceof String);  // true

        String str1  = "Sveiki, Jonai!";
        String str2 = "Kaip sekasi?";
        System.out.println(str1 + "\r\n" + str2);
        int num1 = 50;
        int num2 = 60;
        System.out.println(num1 + num2);


        int amzius = 45;
        if(amzius < 18){
            System.out.println("Balsuoti negalima");
        } else if(amzius <= 45){
            System.out.println("Balsuoti galima");
        } else {
            System.out.println("Galite balsuoti ir kandidatuoti");
        }

        for (int g=6; g <=5; g++) {
            System.out.println(g);
        }

        int q = 9;
        while(q<=8){
            System.out.println(q);
            q++;
        }
        // for (int o=6; o >=5; o++) {    //infinity
        //     System.out.println(o);
        // }

        // int l = 9;
        // while(l>=8){
        //     System.out.println(l); //infinity
        //     l++;
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

        // String myString;
        // int placeInString = 0;
        //
        // Scanner scan = new Scanner(System.in);

        // System.out.println("Please enter a string.");
        // myString = scan.nextLine();
        //
        // for (char c : myString.toCharArray()) {
        //     System.out.println(c);
        // }

        String[] arrr1 = {"Audi", "BMW", "MB", "Lexus", "Volvo", "Opel", "Ford", "VW", "KIA", "Jeep"};

        for(int ind = 0; ind < arrr1.length; ind++){
            System.out.println(arrr1[ind]);
        }
        System.out.println("*********************");
        int inx = 0;
        while(inx<arrr1.length){
            System.out.println(arrr1[inx]);
            inx++;
        }

        System.out.println("*******************");
        for (String index : arrr1){
            System.out.println(index);
        }

        // Scanner arr3 = new Scanner(System.in);
        // System.out.println("Enter string length:");
        // int ilgis = arr3.nextInt();
        // String[] values = new String[ilgis];
        // for (int b = 0; b < values.length; b++) {
        //     System.out.println(values[b]);
        // }

        //
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter the required size of the array: ");
        // int arrDydis = s.nextInt();
        // s.nextLine();
        // int[] myArray = new int[arrDydis];
        // System.out.println("Enter the elements of the array one by one ");
        //
        // for(int a = 0; a<arrDydis; a++) {
        //     myArray[a] = s.nextInt();
        // }
        // System.out.println("Contents of the array are: "+ Arrays.toString(myArray));
        System.out.println("*******************");
        int[] numbers = {58,65,8,4};
        int sum = 0;
        for( int iSum : numbers) {
            sum += iSum;
        }
        System.out.println(sum);


        System.out.println("*****************");
        int[] nums = {10,15,25,35,20,60};
        int total = 0;
        for(int iAve : nums){
            total+=iAve;
        }
        int average = total/nums.length;

        System.out.println(average);

        System.out.println("***********************");

        int[] intArr6 = { 4, 1, 2, 0, 6, 7 };
        int iterations = 0;
        int changins = 0;
        System.out.println("Prieš rikiavimą: " + Arrays.toString(intArr6));
        for (int kindex = 0; kindex < intArr6.length - 1; kindex++) {
            iterations++; //iteracijos;
            int beforeSorting = intArr6[kindex];
            System.out.println("Prieš rikiavimą " + beforeSorting);
            for(int kidx = 0; kidx < intArr6.length - 1; kidx++){
                iterations++;
                if(intArr6[kidx] > intArr6[kidx + 1]){
                    int temporary = intArr6[kidx + 1];
                    intArr6[kidx + 1] = intArr6[kidx];
                    intArr6[kidx] = temporary;
                    changins++;
                   
                }
            }
        }
        System.out.println("Po rikiavimo: " + Arrays.toString(intArr6));
        System.out.println("Iteracijos "+ iterations);
        System.out.println("Pasikeitimai: " + changins);
    }
}


