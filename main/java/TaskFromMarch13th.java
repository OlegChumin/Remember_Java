import com.sun.xml.internal.bind.v2.TODO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TaskFromMarch13th {
    /**
     Задание, написать программу на Java или Kotlin и транслировать ее в версию C#:
1. Считать данные с клавиатуры: Первое число - количество вводимых целых чисел.
     Второе число - набор данных, массив любых целых чисел int[] array =  new array[первое число].
2. Создать новый массив из исходного с сортировкой чисел. Вывести его на экран.
3. Найти максимальны и минимальный элементы массива и вывести их на экран.
4. Вывести сортированный массив в обратном порядке.
5. Добавить к каждому элементу массива 2 и вывести на экран.
6. Найти среди элементов массива четные числа. Вывести их на экран или вывести "нет целых числе"
7. Найти среди элементов массива числа, нацело делящиеся на 3, вывести их на экран, или вывести "нет чисел, делящихся на 3"

Требования: оформить программу в виде методов/функций.
Вывод на экран также оформить как отдельный метод/функцию.

 */
    private static Scanner scanner =  new Scanner(System.in);
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        // 1 способ чтения числа из строки
        int arraySize = getIntNumberByScanner();
        System.out.println("getIntNumberByScanner - array size: " + arraySize);
        int[] arrayOfInt = readAndFillIntArray(arraySize);
        printArray(arrayOfInt);
        printArray(sortingIntArray(arrayOfInt));
        System.out.println("min element of arrayOfInt " + getMinIntArrayElement(arrayOfInt));
        System.out.println("max element oа arrayOfInt " + getMaxIntArrayElement(arrayOfInt));
        getAllEvenNumbersFromIntArray(arrayOfInt);


        // 2 способ чтения числа из строки - потокобезопасный
//        System.out.println("getIntNumberByBufferedReader  - array size: " + getIntNumberByBufferedReader());

    }

    private static int getIntNumberByScanner() {
        return scanner.nextInt();
    }

    private static int getIntNumberByBufferedReader() {
        try {
            return  Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] readAndFillIntArray(int arraySize) {
        int[] arrayOfInt = new int[arraySize];
        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = scanner.nextInt();
        }
        return arrayOfInt;
    }

    private static void printArray(int[] arrayOfInt) {
        System.out.println(Arrays.toString(arrayOfInt));
    }
    // 8 -2 90 7 -10 -> sorting -> -10 -2 7 8 90
    private static int[] sortingIntArray(int[] arrayToSort) {
        Arrays.sort(arrayToSort);
        int[] sortedArray = arrayToSort;
        return sortedArray;
    }

    private static int getMinIntArrayElement(int[] arrayOfInt) {
        int minElement = Integer.MAX_VALUE;
        for (int element: arrayOfInt) {
            if(element <= minElement) {
                minElement = element;
            } // -> arrayOfInt[i]
        }
        return minElement;
    }

    private static int getMaxIntArrayElement(int[] arrayOfInt) {
        int maxElement = Integer.MIN_VALUE;
        for (int element: arrayOfInt) {
            if(element >= maxElement) {
                maxElement = element;
            } // -> arrayOfInt[i]
        }
        return maxElement;
    }

    private static void getAllEvenNumbersFromIntArray(int[] arrayOfInt) {
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i] % 2 == 0) {
                System.out.print(arrayOfInt[i] + " ");
            }
        }
        System.out.println();
    }

    private static void getAllNumbersDividableOnThree(int[] arrayOfInt) {

    }

}