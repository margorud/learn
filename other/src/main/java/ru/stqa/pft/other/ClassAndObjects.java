package ru.stqa.pft.other;

public class ClassAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println(person1.toString());

        person1.setName("Вова");
        person2.setName("Игорь");
        person1.setAge(20);
        person2.setAge(30);
        person1.speake();
        person2.speake();
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void speake(){
        System.out.println("Меня зовут " + getName() + " и мне " + getAge() + " лет");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
