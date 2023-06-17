//Урок 3. Коллекции JAVA: Введение
//        Формат сдачи: ссылка на подписанный git-проект.
//
//        Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Task2_HW {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                ar.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + ar);

            int min = ar.get(0);
            int max = ar.get(0);
            float sum = 0;
            for (int i = 0; i < ar.size(); i++) {
                int num = ar.get(i);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                sum += num;
            }
            float average = sum / ar.size();

            System.out.println("Min: " + min);

            System.out.println("Max: " + max);

            System.out.println("Average: " + average);
        }
    }
}
