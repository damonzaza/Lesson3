/**
 * Створити та застосувати функцію, яка виводитиме таблицю множення розміру AxB,
 * де числа А та В передаються в функцію в якості аргументів.
 * Created by Dmytro Zamosenchuk on 07.11.16.
 */
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int a,b = 0;
        System.out.println("Multiplication table of range numbers");
        Scanner in = new Scanner(System.in);
        System.out.print("Input range A(integer) ");
        a = in.nextInt();
        System.out.print("Input range B(integer) ");
        b = in.nextInt();
        MultiplicationTable (a,b);

    }
    static void MultiplicationTable (int a, int b){
        int Result;
        System.out.print(" | ");
        for (int i = 1; i <= b; i++) {
            System.out.print(i + "  ");
        }
        System.out.println(" ");
        System.out.print("__");
        for (int i = 1; i <= b; i++) {
            System.out.print("___");
        }
        System.out.println(" ");
        for (int i = 1; i <= a; i++) {
            System.out.print(i +"| ");
            for (int j = 1; j <= b; j++) {
                Result=i*j;
                if ( Result >= 10 ){
                    System.out.print(Result + " ");
                }
                else {
                    System.out.print(Result + "  ");
                }
            }
            System.out.println(" ");
        }

    }
}
