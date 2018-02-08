package ru.stqa.pft.other;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {

    public static void main(String [] a)  {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.print("Выводит все числа: ");
        evaluate(list, (n)->true);

        System.out.print("Не выводит ни одного числа: ");
        evaluate(list, (n)->false);

        System.out.print("Вывод четных чисел: ");
        evaluate(list, (n)-> n%2 == 0 );

        System.out.print("Вывод нечетных чисел: ");
        evaluate(list, (n)-> n%2 == 1 );

        System.out.print("Вывод чисел больше 5: ");
        evaluate(list, (n)-> n > 5 );

    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list)  {
            if(predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
