import java.util.Scanner;

/**
 * //4. Разработайте программу, которая выбросит Exception, когда пользователь
 * вводит пустую строку. Пользователю должно показаться сообщение, что пустые
 * строки вводить нельзя.
 */
public class Task4 {

    public static void main(String[] args) {
        inputLine();
    }

    public static void inputLine() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите данные: ");
        String inputText = console.nextLine();
        try {
            if (inputText.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}