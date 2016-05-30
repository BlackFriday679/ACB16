package utils;

/**
 * Created by gorobec on 29.05.16.
 */
public class ArrayUtils {

//  public static <return_data_type> <name(verb)>(<input_data>)
//  public static void <name(verb)>(<input_data>) -> if nothing return - void
//  public static <return_data_type> <name(verb)>()


    public static int[] createAndFillArray(int size){
//        logic
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }



    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
    public static void printArray(boolean[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static int average(int[] array){
        int arraySum = 0;

        for (int i = 0; i < array.length; i++) {
//            arraySum +=  numbers[i];
            arraySum = arraySum + array[i];
        }
        int average = arraySum / array.length;

        return average;
    }

}
