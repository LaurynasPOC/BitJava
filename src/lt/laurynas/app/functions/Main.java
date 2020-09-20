package lt.laurynas.app.functions;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int size = c.nextInt();
        int[] arrNums = new int[size];
        System.out.println("Enter elements of the array: ");

        for(int i = 0; i < arrNums.length; i++){
            arrNums[i] = c.nextInt();
        }
        System.out.println("Your array is: " + Arrays.toString(arrNums));
        System.out.println("*************************************");
        System.out.println("Your array minimul value is: " + getMin(arrNums));
        System.out.println("*************************************");
        System.out.println("Your array maximul value is: " + getMax(arrNums));
        System.out.println("**************************************");
        System.out.println("Your array sum is: " + getSum(arrNums));
    }
    public static int getMin(int[] arrNums){
        int minValue = arrNums[0];
        for(int j = 1; j<arrNums.length; j++){
            if(arrNums[j]<minValue){
                minValue = arrNums[j];
            }
        }
        return minValue;
    }

    public static int getMax(int[] arrNums){
        int maxValue = arrNums[0];
        for (int k = 1; k<arrNums.length; k++){
            if(arrNums[k]>maxValue){
                maxValue = arrNums[k];
            }
        }
        return maxValue;
    }

    public static int getSum(int[] arrNums){
        int arraySum = arrNums[0];
        for (int l = 0; l<arrNums.length; l++){
            arraySum+=arrNums[l];
        }
        return arraySum;
    }

    // public static int getOrdinaryArray(int[] arrNums){
    //     for(int u = 0; u < arrNums.length-1; u++){
    //         for (int o = 0; o < arrNums.length-1; o++){
    //             if(arrNums[o]>arrNums[o+1]){
    //                 int temp = arrNums[o+1];
    //                 arrNums[o+1] = arrNums[o];
    //                 arrNums[o] = temp;
    //             }
    //         }
    //     }
    // }

}
