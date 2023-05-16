// Похідний клас MyExponential
class MyExponential implements MySeries {
    private double a1;
    private double q;
    public MyExponential(double a1, double q) {
        this.a1 = a1;
        this.q = q;
    }

    // Реалізація методів інтерфейсу MySeries
    public double getMember(int n) {
        return a1 * Math.pow(q, n - 1); //Sn = a1 * (1 - q^n) / (1 - q)
        // формула загального члена арифметичної прогресії.
        // У формулі n відповідає номеру члена в прогресії, а a1 та q - це перший член та різниця прогресії відповідно.
    }

    public double getSum(int n) {
        return a1 * (1 - Math.pow(q, n)) / (1 - q); //де a1 - перший член прогресії,
        // q - знаменник геометричної прогресії, n - кількість членів прогресії, Sn - сума перших n членів.
    }

    // Перевизначення методу toString
    @Override
    public String toString() {
        return "MyExponential: a1 = " + a1 + ", q = " + q;
    }

    // Перевизначення методу equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false; //перевірка на те, що переданий об'єкт obj є не null
        // і що клас obj відрізняється від класу поточного об'єкта this.
        // Якщо ця перевірка не пройдена, повертається значення false.
        MyExponential myExponential = (MyExponential) obj;
        return Double.compare(myExponential.a1, a1) == 0 &&
                Double.compare(myExponential.q, q) == 0; // порівняння полів об'єкта myExponential з відповідними полями поточного об'єкта this.
        // Для цього використовується метод Double.compare(), який порівнює два значення типу double
    }
}