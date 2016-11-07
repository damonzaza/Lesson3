/**
 * Створити та застосувати функцію,
 * яка прийматиме одновимірний масив цілих чисел, а повертатиме найменше число з цього масиву.
 * Created by Dmytro Zamosenchuk on 07.11.16.
 */
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("The smallest number from random array");
        Scanner in = new Scanner(System.in);
        System.out.print("Input range of array (integer) ");
        n = in.nextInt();
        int[] arr = Array(n);
        ArrayPrint(arr);
        System.out.print ("The smallest number from random array is " + ArraySmall(arr));
    }
    static int[] Array (int n){
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=(int)(Math.random()*n);
            }
        return arr;
        }

    static void ArrayPrint (int[] arr){
        System.out.print ("Array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i]);
            if (i < (arr.length-1)) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
    static int ArraySmall (int[] arr){
        int small=2147483647;
        for (int i = 0; i < arr.length; i++) {
            if (small > arr[i]){
                small=arr[i];
            }
        }
        return small;
    }
}
