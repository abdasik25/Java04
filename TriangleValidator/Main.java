package TriangleValidator;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int x1 = 3;
        int y1 = 1;
        int x2 = 1;
        int y2 = 10;

        System.out.println("Point №1: (" + x + "," + y + ")\n" +
                "Point №2: (" + x1 + "," + y1 + ")\n" +
                "Point №3: (" + x2 + "," + y2 + ")\n");

        System.out.println("Do they make right triangle?" + (Triangle.isRightTriangle(x, y, x1, y1, x2, y2) ?
                " Yes" : " No"));
    }
}
