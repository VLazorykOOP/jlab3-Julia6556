// Похідний клас Rectangle
class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name, width * height, 2 * (width + height)); //виклик конструктора батьківського класу Figure,
        // який приймає назву name, площу та периметр прямокутника.
        this.width = width;
        this.height = height;
    }

    // Методи доступу до полів
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Перевизначення методу toString
    @Override
    public String toString() {
        return "Rectangle: " + super.toString() + ", Width: " + width + ", Height: " + height;
    }

    // Перевизначення методу equals
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        Rectangle rectangle = (Rectangle) obj; // приведене obj до типу Rectangle
        return Double.compare(rectangle.width, width) == 0 && //. Якщо значення двох чисел є однаковими, метод повертає 0.
                // Якщо значення першого числа менше за значення другого числа, метод повертає -1.
                // Якщо значення першого числа більше за значення другого числа, метод повертає 1
                Double.compare(rectangle.height, height) == 0;
    }
}
