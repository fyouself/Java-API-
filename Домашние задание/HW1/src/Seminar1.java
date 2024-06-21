import java.util.Arrays;
import java.util.Scanner;

public class Seminar1 {

    public static void main(String[] args) {
        int [] arr = {1, 2,5, 5, 5, 1, 2,4};
        changeOrder(arr,5);
        System.out.println(Arrays.toString(arr));


    }
    /**
     * Дан массив nums = [3,2,2,3] и число val = 3.
     * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
     * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
     * <p>
     * 3 2 2 3 [3] -> 2 2 3 3
     * 1 2 3 4 5 [3] -> 1 2 4 5 3
     * <p>
     * [5] 1 2 5 3 3 3 4 5 5
     */
    static void changeOrder(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                for (int j = i; j < arr.length - 1; j++) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }


        /**
         * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
         * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
         */
//
//        Scanner scanner = new Scanner( System.in);
//        String name = scanner.nextLine();
//        System.out.println("Привет, " + name + "!");






    }

