package HW1;

public class Task1 {
    public static void main(String[] args) {
        
        // System.out.println(arithmeticException(10, 0));

        // int[] array = {1, 2, 3, 4};
        // arrayIndexOutOfBoundsException(array, 5);

        System.out.println(numberFormatException("badUser"));
    }

    // создаем метод, который делит число a на b и возвращает результат 
    // и будет возвращать арифметическое исключение при попытке поделить число на ноль
    public static double arithmeticException(int a, int b) {
        return a / b;
    }

    // создаем метод, который должен выводить первые несколько элементов (число задается пользователем)
    // и выдает исключения о выходе за пределы массива, если передать ему limit, который будет больше длины массива
    public static void arrayIndexOutOfBoundsException(int[] array, int limit) {
        for (int i = 0; i < limit; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // создаем метод, который преобразует строку в целое число
    // при этом, если пользователь ошибся и передал вместо числа какие-то символы, выпадает NumberFormatException
    public static int numberFormatException(String number) {
        return Integer.parseInt(number);
    }
}