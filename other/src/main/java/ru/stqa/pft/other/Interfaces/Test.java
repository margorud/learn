package ru.stqa.pft.other.Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Pip");

        showInfo(animal);
        showInfo(person);
}

    public static void showInfo(Info info){
        info.showInfo();
    }
}
