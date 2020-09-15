package lt.laurynas.app;

import java.util.Arrays;
import java.util.Scanner;

public class NdFunctions {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the required size of the array: ");
        int arrDydis = s.nextInt();
        int[] myArray = new int[arrDydis];
        System.out.println("Enter the elements of the array one by one ");

        for(int a = 0; a<arrDydis; a++) {
            myArray[a] = s.nextInt();
        }

        System.out.println("Contents of the array are: "+ Arrays.toString(myArray));
        System.out.println("******************************************************************");
        System.out.println("Lowest array integer is " + getMin(myArray));
        System.out.println("******************************************************************");
        System.out.println("Highest array integer is " + getMax(myArray));
        System.out.println("******************************************************************");
        System.out.println("Array sum is " + getSum(myArray));
        System.out.println("******************************************************************");
        System.out.println("Išrikiuotas arr " + Arrays.toString(gerOrdinaryArr(myArray)));
    }
    public static int getMin(int[] myArray){
        int minValue = myArray[0];
        for(int i=1;i<myArray.length;i++){
            if(myArray[i] < minValue){
                minValue = myArray[i];
            }
        }
        return minValue;
    }

    public static int getMax(int[] myArray){
        int maxValue = myArray[0];
        for(int i = 1; i < myArray.length; i++){
            if(myArray[i] > maxValue){
                maxValue = myArray[i];
            }
        }
        return maxValue;
    }

    public static int getSum(int[] myArray){
        int sumValue = 0;
        for(int i = 0; i < myArray.length; i++){
            sumValue+=myArray[i];
        }
        return sumValue;
    }

    public static int[] gerOrdinaryArr(int[] myArray){
        for(int i = 0; i<myArray.length-1; i++){
            for(int k = 0; k<myArray.length - 1; k++){
                if(myArray[k] > myArray[k +1]){
                    int temp = myArray[k + 1];
                    myArray[k +1 ]=myArray[k];
                    myArray[k]=temp;
                }
            }
    }
        return myArray;
}

}

