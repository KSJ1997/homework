import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DZ4 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"))) {
            String userInput = getUserInput(reader);
            System.out.println("Вы ввели: " + userInput);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EmptyInputException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getUserInput(BufferedReader reader) throws EmptyInputException, IOException {
        System.out.print("Введите текст: ");
        String input = reader.readLine();

        if (input.isEmpty()) {
            throw new EmptyInputException("Пустые строки вводить нельзя");
        }

        return input;
    }
}

class EmptyInputException extends Exception {
    public EmptyInputException(String message) {
        super(message);
    }
}
