// Базовий клас Figure
import java.util.Objects;

class Figure {
    protected String name;
    protected double area;
    protected double perimeter;

    public Figure(String name, double area, double perimeter) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }

    // Методи доступу до полів
    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    // Перевизначення методу toString
    @Override
    public String toString() {
        return "Name: " + name + ", Area: " + area + ", Perimeter: " + perimeter;
    }

    // Перевизначення методу equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Figure figure = (Figure) obj;
        return Double.compare(figure.area, area) == 0 &&
                Double.compare(figure.perimeter, perimeter) == 0 &&
                Objects.equals(name, figure.name);
    }
}
