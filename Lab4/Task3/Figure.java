package Lab4.Task3;

import java.util.Objects;

public class Figure {
    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInfo() {
        return "Фигура: " + name + ", цвет: " + color;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
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
        Figure figure = (Figure) other;
        return Objects.equals(name, figure.name) && Objects.equals(color, figure.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
