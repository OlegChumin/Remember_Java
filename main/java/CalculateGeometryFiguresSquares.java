import java.util.Scanner;

public class CalculateGeometryFiguresSquares {
    public static void main(String[] args) {
        String figureName = readGeometryFigureName();
        int figureNumber = returnNumberOfGeometryFigure(figureName);
        System.out.println("figureName = " + figureName + " figureNumber = " + figureNumber);
        double triangleSqure = calculateTriangleSqure();
        System.out.println("площадь треугольника = " + triangleSqure);
    }

    //метод, который считывает название фигуры
    public static String readGeometryFigureName() {
//        Scanner scanner = new Scanner(System.in);
////        String str = scanner.next();
////        return str;
//        return scanner.next();
        return new Scanner(System.in).next();
    }

    //метод, который определяет тип фигуры
    /**
     * 0 - ничего
     * 1 - треугольник
     * 2 - круг
     * 3 - квадрат
     * 4 - трапеция
     * 5 - эллипс
     * 6 - многоугольник (более 4 углов)
     */
    public static int returnNumberOfGeometryFigure(String figureName) {
        int figureNumber = 0;
        switch (figureName) {
            case "треугольник": return 1;
            case "круг": return 2;
            case "квадрат": return 3;
            case "трапеция": return 4;
            default:
                System.out.println("нет такой фигуры в базе программы");
                break;
        }
        return figureNumber;
    }

    //методы, которые вычисляет площадь фигуры
    //метод, вычисляющий площадь треугольника
    public static double calculateTriangleSqure() {
        double height = new Scanner(System.in).nextDouble();
        double side = new Scanner(System.in).nextDouble();
        return 0.5 * height * side;
    }
    //метод, вычисляющий площадь круга

    //метод, вычисляющий площадь квадрата

    //метод, вычисляющий площадь трапеции


    //метод, который выводит результаты вычислений
}
