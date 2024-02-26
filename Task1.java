
import java.util.Scanner;

/**
 * //1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа
 * (типа float), и возвращает введенное значение. Ввод текста вместо числа не
 * должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(requestNumber());
    }

    public static float requestNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите дробное число: ");
                String inputNumber = scanner.nextLine();
                return Float.parseFloat(inputNumber);
            } catch (NumberFormatException e) {
                System.err.println("Введено неверное значение!");
            }
        }

    }
}