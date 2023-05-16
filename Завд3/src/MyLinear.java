// Похідний клас MyLinear
class MyLinear implements MySeries {
    private double a1;
    private double d;

    public MyLinear(double a1, double d) {
        this.a1 = a1;
        this.d = d;
    }

    // Реалізація методів інтерфейсу MySeries
    public double getMember(int n) {
        return a1 + (n - 1) * d; //Це формула, яка використовується для знаходження n-го члена арифметичної прогресії
    }

    public double getSum(int n) {
        return (2 * a1 + (n - 1) * d) * n / 2;
    }

    // Перевизначення методу toString
    @Override
    public String toString() {
        return "MyLinear: a1 = " + a1 + ", d = " + d;
    }

    // Перевизначення методу equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        MyLinear myLinear = (MyLinear) obj;
        return Double.compare(myLinear.a1, a1) == 0 &&
                Double.compare(myLinear.d, d) == 0;
    }
}
