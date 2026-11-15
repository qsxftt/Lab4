package Lab4.Task3;

import java.util.Objects;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super("Прямоугольник", color);
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Ширина должна быть положительной, установлено 1.0");
            this.width = 1.0;
        }
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Высота должна быть положительной, установлено 1.0");
            this.height = 1.0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Ширина должна быть положительной");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Высота должна быть положительной");
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", стороны: " + width + " и " + height + ", площадь: " + (width * height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", width=" + width +
                ", height=" + height +
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
        Rectangle that = (Rectangle) other;
        return width == that.width && height == that.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }
}
