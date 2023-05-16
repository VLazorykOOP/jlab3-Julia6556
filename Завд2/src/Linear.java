public class Linear extends Series {
    private double a; // перший член прогресії
    private double d; // різниця прогресії

    public Linear(double a, double d) {
        this.a = a;
        this.d = d;
    }

    public double getMember(int n) {
        return a + (n - 1) * d;
    }

    public double getSum(int n) {
        return n * (2 * a + (n - 1) * d) / 2;
    }

    @Override
    public String toString() {
        return String.format("Linear progression: a=%.2f, d=%.2f", a, d);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Linear)) return false;
        Linear other = (Linear) obj;
        return Double.compare(a, other.a) == 0 && Double.compare(d, other.d) == 0;
    }
}
