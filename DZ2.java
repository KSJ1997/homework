public class DZ2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Инициализируем массив intArray
        try {
           int d = 0;
           if (d != 0) {
               double catchedRes1 = intArray[8] / d;
               System.out.println("Значение catchedRes1 = " + catchedRes1);
           } else {
               System.out.println("Деление на ноль недопустимо.");
           }
        } catch (ArithmeticException e) {
           System.out.println("Перехвачено исключение: " + e);
        }
    }
}
