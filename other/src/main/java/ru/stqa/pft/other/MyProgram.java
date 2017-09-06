package ru.stqa.pft.other;

public class MyProgram {
    public static void main(String[] args) {
        Point p1 = new Point(40.0, 80.55);
        Point p2 = new Point(78.1, 20);
        System.out.println("Расстояние между точкой a с координатами " + p1.x + ", " + p1.y + " и точкой b с координатами " + p2.x + ", " + p2.y + " = " + p1.distance(p1, p2));

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " +  s.l + " = " + s.area());

        Rectangle r = new Rectangle(10, 2);
        System.out.println("Площадь прямоугольника со сторонами " +  r.a + " и " + r.b + " = " + r.area());
    }
}