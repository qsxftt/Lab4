package Lab4.Task1;

public class Task1 {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1, 2, 4, 6);
        Vector2D v2 = new Vector2D(5, 1, 7, 4);
        Vector2D v3 = new Vector2D(0, 0, 3, 4);

        System.out.println("Вектор 1: " + v1);
        System.out.println("Составляющие v1: dx = " + v1.getDx() + ", dy = " + v1.getDy());
        System.out.println("Длина v1: " + v1.getLength());

        System.out.println("\nВектор 2: " + v2);
        System.out.println("Составляющие v2: dx = " + v2.getDx() + ", dy = " + v2.getDy());
        System.out.println("Длина v2: " + v2.getLength());

        Vector2D sum = v1.add(v2);
        System.out.println("\nСумма v1 + v2: " + sum);

        double dot = v1.dotProduct(v2);
        System.out.println("Скалярное произведение v1 и v2: " + dot);

        Vector2D scaled = v1.multiply(2);
        System.out.println("Умножение v1 на 2: " + scaled);
        System.out.println("Длина умноженного вектора: " + scaled.getLength());

        System.out.println("\nВектор 3: " + v3);
        System.out.println("Длина v3: " + v3.getLength());
    }
}
