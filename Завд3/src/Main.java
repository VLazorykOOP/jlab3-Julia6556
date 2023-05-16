import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення a для MyLinear:");
        double linearA = readDouble(scanner);

        System.out.println("Введіть значення d для MyLinear:");
        double linearD = readDouble(scanner);

        MyLinear myLinear = new MyLinear(linearA, linearD);
        System.out.println(myLinear);
        System.out.println("Член #5: " + myLinear.getMember(5));
        System.out.println("Сума перших 5 членів: " + myLinear.getSum(5));

        // Введення значень для MyExponential
        System.out.println("Введіть значення a для MyExponential:");
        double exponentialA = readDouble(scanner);

        System.out.println("Введіть значення q для MyExponential:");
        double exponentialQ = readDouble(scanner);

        MyExponential exponential = new MyExponential(exponentialA, exponentialQ);
        System.out.println("MyExponential:");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("a%d = %.2f%n", i, exponential.getMember(i));
        }
        System.out.printf("S5 = %.2f%n", exponential.getSum(5));

        // Перевірка методів toString та equals
        MyExponential exponential2 = new MyExponential(exponentialA, exponentialQ);
        System.out.println(exponential);
        System.out.println(exponential.equals(exponential2));

        // Введення значення радіуса кола
        System.out.println("Введіть радіус кола:");
        double radius = readDouble(scanner);
        Circle circle = new Circle("Коло 1", radius);
        System.out.println(circle);
        System.out.println("Площа: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());

        // Введення значень для прямокутника
        System.out.println("Введіть ширину прямокутника:");
        double width = readDouble(scanner);

        System.out.println("Введіть висоту прямокутника:");
        double height = readDouble(scanner);

        Rectangle rectangle = new Rectangle("Прямокутник 1", width, height);
        System.out.println(rectangle);
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Висота: " + rectangle.getHeight());
    }

    private static double readDouble(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            if (input.matches("\\d+(\\.\\d+)?")) {
                return Double.parseDouble(input);
            } else {
                System.out.println("Введіть допустиме числове значення:");
            }
        }
    }
}
