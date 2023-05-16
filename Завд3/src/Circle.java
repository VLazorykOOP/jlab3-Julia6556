class Circle extends Figure { //успадковує клас Figure
    private double radius; //представляє радіус кола.

    public Circle(String name, double radius) {
        super(name, Math.PI * radius * radius, 2 * Math.PI * radius); //виклик конструктора батьківського класу Figure,
        // який приймає назву name, площу та периметр кола.
        this.radius = radius;
    }

    // Метод доступу до поля
    public double getRadius() {
        return radius;
    }

    // Перевизначення методу toString
    @Override
    public String toString() {
        return "Circle: " + super.toString() + ", Radius: " + radius;
    }

    // Перевизначення методу equals
    @Override
    public boolean equals(Object obj) { //порівнює два об'єкти класу Circle
        if (!super.equals(obj))
            return false;
        Circle circle = (Circle) obj; //приведення об'єкту obj до типу Circle
        return Double.compare(circle.radius, radius) == 0; //Якщо радіуси рівні, повертається значення true, інакше - false
    }
}
