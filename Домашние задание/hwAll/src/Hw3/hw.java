package Hw3;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hw {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        fillArray(array);
        System.out.println(array);
        
//       removeEven(array); // удаление четных цифр 
//        System.out.println(array);

//        System.out.println("Min number: " + findMin(array));

        System.out.println("Среднее значение = " + middleSum(array));




    }

    /**
     * Пусть дан произвольный список целых чисел.
     *
     * 1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
     * 2) Найти минимальное значение         (Integer findMin(ArrayList<Integer> list))
     * 3) Найти максимальное значение
     * 4) Найти среднее значение
     *
     * То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел, и делает свою работу.
     */

    static void fillArray(ArrayList<Integer> arr) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        System.out.print(" Введите размер массива: ");
        size = scanner.nextInt();
//        for( int i =0; i<size;i++){
//            System.out.print("Введите " + (i+1)+ "-е значение: " );
//            arr.add(scanner.nextInt());
//            }
        int min = 0;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int n = random.nextInt(diff + 1) + min;
            arr.add(n);
        }
    }

    static void removeEven(ArrayList<Integer> list){
        for (int i =0; i< list.size(); i++){
         if (list.get(i)%2 ==0  ){
             list.remove(i);
         }
        }

    }

    static Integer findMin(ArrayList<Integer> list){
        int min = list.get(0);
        for (Integer n:list) {
            if (n<min) {
                min = n;
            }
        }

        return min;
    }

    static String middleSum(ArrayList<Integer> list){
        double sum = 0;

        for (Integer n:list) {
            sum+=n;
            }
        double mid = sum/list.size();
        String result = String.format("%.3f", mid);
        return result;
        }

    }


