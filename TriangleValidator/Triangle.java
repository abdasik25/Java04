package TriangleValidator;

public class Triangle {

    public static boolean isTriangle(double firstSide, double secondSide, double thirdSide) {
        return ((firstSide + secondSide > thirdSide) && (firstSide + thirdSide > secondSide)
                && (secondSide + thirdSide > firstSide));
    }

    public static boolean PythagoreanTheoremCheck(double firstSide, double secondSide, double thirdSide) {
        return ((Math.pow(firstSide, 2) + Math.pow(secondSide, 2) == Math.pow(thirdSide, 2)) ||
                (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2) == Math.pow(firstSide, 2)) ||
                (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2) == Math.pow(secondSide, 2)));
    }

    public static boolean isRightTriangle(int x, int y, int x1, int y1, int x2, int y2) {
        double firstSide = Math.sqrt(Math.pow((y - x), 2) + Math.pow((y1 - x1), 2));
        double secondSide = Math.sqrt(Math.pow((y - x), 2) + Math.pow((y2 - x2), 2));
        double thirdSide = Math.sqrt(Math.pow((y2 - x2), 2) + Math.pow((y1 - x1), 2));

        return (isTriangle(firstSide, secondSide, thirdSide) && PythagoreanTheoremCheck(firstSide, secondSide, thirdSide));

    }
}
