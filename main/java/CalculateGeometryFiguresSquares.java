import java.util.Scanner;

public class CalculateGeometryFiguresSquares {
    public static void main(String[] args) {
        String figureName = readGeometryFigureName();
        System.out.println("figureName = " + figureName);

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

    //методы, которые вычисляет площадь фигуры

    //метод, который выводит результаты вычислений
}
