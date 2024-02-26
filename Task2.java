/**
 * //2. Если необходимо, исправьте данный код
 * try {
 * int d = 0;
 * double catchedRes1 = intArray[8] / d;
 * System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 * System.out.println("Catching exception: " + e);
 * }
 * 
 */
public class Task2 {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int d = 0;
        int index = 3;
        method(arr, d, index);
    }

    public static void method(int[] intArray, int d, int index) {
        try {
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

    }
}