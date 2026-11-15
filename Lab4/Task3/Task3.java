package Lab4.Task3;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Предметная область: геометрические фигуры (развитие программы расчёта гипотенузы из ЛР 2-3).");
        System.out.println("Базовый класс Figure, наследники RightTriangle и Rectangle.");
        System.out.println();

        System.out.println("Проверка параметров при создании объекта с отрицательным катетом:");
        RightTriangle wrongTriangle = new RightTriangle("Красный", -5, 4);
        System.out.println("После проверки: " + wrongTriangle);
        System.out.println();

        Figure singleFigure = new RightTriangle("Синий", 3, 4);
        System.out.println("Переменная родительского типа: " + singleFigure.getInfo());
        System.out.println();

        Figure[] figures = new Figure[4];
        figures[0] = new RightTriangle("Синий", 3, 4);
        figures[1] = new RightTriangle("Зеленый", 6, 8);
        figures[2] = new Rectangle("Желтый", 5, 10);
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
}
