package Lab4.Task3;

import java.util.Scanner;

public class Task3 {
    public static void menu() {
        System.out.println("\nМЕНЮ");
        System.out.println("1. Выполнить расчет");
        System.out.println("2. Демонстрация ООП");
        System.out.println("3. О программе");
        System.out.println("4. Об авторе");
        System.out.println("5. Выход");
        System.out.print("Выберите действие 1-5: ");
    }

    public static void author() {
        System.out.println("\nОб авторе");
        System.out.println("Автор: Анисимов Данил РИ-250911");
    }

    public static void info() {
        System.out.println("\nИнформация о программе");
        System.out.println("Предметная область: геометрические фигуры (развитие программы расчёта гипотенузы из ЛР 2-3).");
        System.out.println("Базовый класс Figure, наследники RightTriangle и Rectangle.");
        System.out.println("Для треугольника вычисляется гипотенуза: c = sqrt(a^2 + b^2) и площадь: S = (a * b) / 2.");
        System.out.println("Для прямоугольника вычисляется диагональ: d = sqrt(w^2 + h^2) и площадь: S = w * h.");
    }

    public static int readInt(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            scanner.next();
            return -1;
        }
    }

    public static double dataVerification(Scanner scanner, String text) {
        while (true) {
            System.out.print(text);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Значение должно быть положительным");
                }
            } else {
                scanner.next();
                System.out.println("Это не число. Повторите попытку");
            }
        }
    }

    public static void calculate(Scanner scanner) {
        int type;
        while (true) {
            System.out.println("\nВыберите фигуру:");
            System.out.println("1. Прямоугольный треугольник");
            System.out.println("2. Прямоугольник");
            System.out.print("Ваш выбор: ");
            type = readInt(scanner);
            if (type == 1 || type == 2) {
                break;
            }
            System.out.println("Нет такого пункта. Введите 1 или 2");
        }

        System.out.print("Введите цвет фигуры: ");
        String color = scanner.next();

        Figure figure;
        if (type == 1) {
            double a = dataVerification(scanner, "Введите первый катет: ");
            double b = dataVerification(scanner, "Введите второй катет: ");
            figure = new RightTriangle(color, a, b);
        } else {
            double width = dataVerification(scanner, "Введите ширину: ");
            double height = dataVerification(scanner, "Введите высоту: ");
            figure = new Rectangle(color, width, height);
        }

        System.out.println("Результат: " + figure.getInfo());
    }

    public static void demo() {
        System.out.println("\nПроверка параметров при создании объекта с отрицательным катетом:");
        RightTriangle wrongTriangle = new RightTriangle("Красный", -5, 4);
        System.out.println("После проверки: " + wrongTriangle);
        System.out.println();

        Figure singleFigure = new RightTriangle("Синий", 3, 4);
        System.out.println("Переменная родительского типа: " + singleFigure.getInfo());
        System.out.println();

        Figure[] figures = new Figure[4];
        figures[0] = new RightTriangle("Синий", 3, 4);
        figures[1] = new RightTriangle("Зеленый", 6, 8);
        figures[2] = new Rectangle("Желтый", 3, 4);
        figures[3] = new Rectangle("Черный", 4, 4);

        System.out.println("Обработка массива фигур в одном цикле:");
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getInfo());
            System.out.println("toString(): " + figures[i]);
        }

        RightTriangle t1 = new RightTriangle("Синий", 3, 4);
        RightTriangle t2 = new RightTriangle("Синий", 3, 4);
        Rectangle r1 = new Rectangle("Синий", 3, 4);

        System.out.println("\nДемонстрация equals() и hashCode():");
        System.out.println("t1.equals(t2): " + t1.equals(t2));
        System.out.println("t1.hashCode() = " + t1.hashCode() + ", t2.hashCode() = " + t2.hashCode());
        System.out.println("t1.equals(r1): " + t1.equals(r1));
        System.out.println("t1.hashCode() = " + t1.hashCode() + ", r1.hashCode() = " + r1.hashCode());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            menu();
            int choice = readInt(scanner);

            switch (choice) {
                case 1:
                    calculate(scanner);
                    break;
                case 2:
                    demo();
                    break;
                case 3:
                    info();
                    break;
                case 4:
                    author();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Нет такого пункта. Введите число от 1 до 5");
                    break;
            }
        }
    }
}
