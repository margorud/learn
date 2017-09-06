package ru.stqa.pft.other;

public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p1, Point p2) {
        double AC = p1.x - p1.y;
        double BC = p2.x - p2.y;
        double d;
        return d = Math.sqrt(AC*AC +BC*BC);
    }
}