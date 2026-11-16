package Lab4.Task3;

import java.util.Objects;

public class RightTriangle extends Figure {
    private double a;
    private double b;

    public RightTriangle(String color, double a, double b) {
        super("Прямоугольный треугольник", color);
        if (a > 0) {
            this.a = a;
        } else {
            System.out.println("Катет должен быть положительным, установлено 1.0");
            this.a = 1.0;
        }
        if (b > 0) {
            this.b = b;
        } else {
            System.out.println("Катет должен быть положительным, установлено 1.0");
            this.b = 1.0;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0) {
            this.a = a;
        } else {
            System.out.println("Катет должен быть положительным");
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b > 0) {
            this.b = b;
        } else {
            System.out.println("Катет должен быть положительным");
        }
    }

    public double calculateHypotenuse() {
        return Math.sqrt(a * a + b * b);
    }

    public double calculateArea() {
        return (a * b) / 2.0;
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                + ", катеты: " + a + " и " + b
                + ", гипотенуза: " + calculateHypotenuse()
                + ", площадь: " + calculateArea();
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        if (!super.equals(other)) {
            return false;
        }
        RightTriangle that = (RightTriangle) other;
        return a == that.a && b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), a, b);
    }
}
