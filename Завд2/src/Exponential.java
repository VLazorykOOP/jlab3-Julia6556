public class Exponential extends Series {
    private double a; // перший член прогресії
    private double r; // знаменник прогресії

    public Exponential(double a, double r) {
        this.a = a;
        this.r = r;
    }

    public double getMember(int n) {
        return a * Math.pow(r, n - 1);
    }

    public double getSum(int n) {
        return a * (Math.pow(r, n) - 1) / (r - 1);
    }

    @Override
    public String toString() {
        return String.format("Exponential progression: a=%.2f, r=%.2f", a, r);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Exponential)) return false;
        Exponential other = (Exponential) obj;
        return Double.compare(a, other.a) == 0 && Double.compare(r, other.r) == 0;
    }
}

