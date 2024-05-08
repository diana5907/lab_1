import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число a: ");
        int a = scanner.nextInt();

        System.out.print("Введіть дійсне число c: ");
        double c = scanner.nextDouble();

        String result = (c == 0) ? "Неможливо обчислити значення виразів." :
                "Значення виразів:\n" +
                        "a - 4c = " + (a - 4 * c) + "\n" +
                        "4ac = " + (4 * a * c) + "\n" +
                        "a^2 - 2a = " + (Math.pow(a, 2) - 2 * a) + "\n" +
                        "c - 4a = " + (c - 4 * a) + "\n" +
                        "a = 6";

        System.out.println(result);
    }
}
