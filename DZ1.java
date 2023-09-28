import java.util.InputMismatchException;
import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        float floatValue = getInputFloat();
        System.out.println("Вы ввели: " + floatValue);
    }

    public static float getInputFloat() {
        float result = 0;
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);

        while (!validInput) {
            try {
                System.out.print("Введите дробное число: ");
                result = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите дробное число.");
                scanner.nextLine(); // Очистка буфера после ошибочного ввода
            }
        }

        scanner.close();
        return result;
    }
}
