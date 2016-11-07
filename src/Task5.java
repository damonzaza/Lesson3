/**
 * Створити та застосувати функцію, яка прийматиме двовимірний масив розміром MxN,
 * а повертатиме одновимірний масив розміру M, в якому будуть записана сума кожного ряду. Наприклад:
 * Масив розміром 2x3:
 * 4 1 16
 * -5 3 0
 * Результат:
 * 21 -2
 * Created by Dmytro Zamosenchuk on 07.11.16.
 */
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        int m,n = 0;
        System.out.println("Two dimension array convert to one dimension array");
        Scanner in = new Scanner(System.in);
        System.out.print("Input range M(integer) ");
        m = in.nextInt();
        System.out.print("Input range N(integer) ");
        n = in.nextInt();

    }
    static int[][] Array (int n, int m){
        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=(int)(Math.random()*100);
            }
        }
        return arr;
    }
    static int [] ArraySumString (int [][]arr){
        int [] arrI = new int[];
        int Result = 0;
        for (int i = 0; i < arr[i].length; i++) {
            for (int j = 0; j < ; j++) {
                
            }
            Result=+arr[i][j]                        
        }
    }
}
