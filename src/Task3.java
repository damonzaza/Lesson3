/**
 * Створити та застосувати функцію, яка прийматиме ціле число n як аргумент, в якій створютиметься
 * масив чисел розміру n, заповнений випадковими цілими числами з напівінтервалу [0, n)
 * Created by Dmytro Zamosenchuk on 07.11.16.
 */
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Random array");
        Scanner in = new Scanner(System.in);
        System.out.print("Input range (integer) ");
        n = in.nextInt();
    Array(n);
    }
    static void Array (int n){
        int [] arr = new int[(n)];
        for (int i = 0; i < n; i++) {
            arr[i]=(int)(Math.random()*n);
        System.out.print(arr[i] + ", ");
        }

    }

}
