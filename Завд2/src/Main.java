import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перший коефіцієнт для лінійної послідовності:");
        double linearCoefficient1 = scanner.nextDouble();
        System.out.println("Введіть другий коефіцієнт для лінійної послідовності:");
        double linearCoefficient2 = scanner.nextDouble();
        System.out.println("Введіть перший коефіцієнт для експоненційної послідовності:");
        double exponentialCoefficient1 = scanner.nextDouble();
        System.out.println("Введіть другий коефіцієнт для експоненційної послідовності:");
        double exponentialCoefficient2 = scanner.nextDouble();
        Series[] series = new Series[2];
        series[0] = new Linear(linearCoefficient1, linearCoefficient2);
        series[1] = new Exponential(exponentialCoefficient1, exponentialCoefficient2);

        for (Series s : series) {
            System.out.println(s);
            for (int i = 1; i <= 5; i++) {
                System.out.printf("Член #%d: %.2f\n", i, s.getMember(i));
            }
            System.out.printf("Сума перших 5 членів: %.2f\n", s.getSum(5));
            System.out.println();
        }
    }
}

