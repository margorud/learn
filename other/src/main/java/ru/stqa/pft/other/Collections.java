package ru.stqa.pft.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        /*String[] langs = {"Java", "C#", "Python", "PHP"}; //массив

        for (int i = 0; i < langs.length; i++){
            System.out.println("Я хочу выучить " + langs[i]);
        }

        List<String> languages = new ArrayList<>(); //список
        languages.add("Java");
        languages.add("C#");
        languages.add("Python");
        languages.add("PHP");

        for (String l : languages){
            System.out.println("Я хочу выучить " + l);
        }*/

        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP"); //преобразование массива в список

        for (int i = 0; i < languages.size(); i++){
            System.out.println("Я хочу выучить " + languages.get(i));
        }
    }
}
