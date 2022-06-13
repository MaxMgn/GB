package lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp3 {
    //static int []  array;
    public static void main(String[] args) {

       int[] onesAndZeroes = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println (Arrays.toString(onesAndZeroes));
        for (int i = 0; i < onesAndZeroes.length; i++) {
            if (onesAndZeroes[i] == 0) {
                onesAndZeroes[i] = 1;
            } else onesAndZeroes[i]=0;
        }
        System.out.println (Arrays.toString(onesAndZeroes));
        int[] hundredValuesArray = new int[100];
            for (int i=0; i < hundredValuesArray.length; i++){
                hundredValuesArray[i]= i+1;
        }
        System.out.println (Arrays.toString(hundredValuesArray));
            int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println (Arrays.toString(arr));
        for (int i= 0; i<arr.length; i++){
            if (arr[i] < 6){
                arr[i]*=2;
            }
        }
        System.out.println (Arrays.toString(arr));

        int [] [] sq = new int[5] [5];
        for (int i = 0; i< sq.length; i++){
            sq  [i] [i]  = 1;
            sq  [i] [sq.length-i-1]  = 1;
            System.out.println (Arrays.toString(sq[i]));
        }
        int max, min;
        max = arr[0];
        min = arr[0];
        for (int i = 0; i< arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            } else if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println (max);
        System.out.println (min);

        Random rand = new Random();
        int x = rand.nextInt(20);

    }

    private static <array> int[] printArray(int len, int initialValue) {
        int []  array = new int[len];
        for (int i = 0; i < len; i++ ){
            array[i] = initialValue;
        }
        return array;
    }
    /*
    private static <array> void printMaxAndMin(array){
        for (int i = 0; i< arr.length; i++)
        System.out.println (max);
        System.out.println (min);
    }
    */
}
