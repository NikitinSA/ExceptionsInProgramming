package HW1;

public class Task2 {
    public static void main(String[] args) {
        // рассмотрим вариант, когда у нас все хорошо
        String[][] arrOk = {{"1", "1", "1", "1", "1"},
                            {"1", "1", "1", "1", "1"}};
        // метод выдаст правильный результат
        System.out.println(sum2d(arrOk));

        //теперь представим, что пользователь ввел символы, вместо числа
        String[][] arrBadUser = {{"one", "1", "1", "1", "1"},
                            {"1", "1", "1", "1", "1"}};
        //получаем NumberFormatException
        // System.out.println(sum2d(arrBadUser));
        //тоже самое будет для чисел с плавающей точкой и любых других данных, которые не возможно привести к типу данных int

        //теперь представим, что количество столбцов меньше пяти
        String[][] arrLessThanFive = {{"1", "1", "1", "1"},
                            {"1", "1", "1", "1"}};
        //получаем ArrayIndexOutOfBoundsException
        // System.out.println(sum2d(arrLessThanFive));

        // в случае если переданный в функцию массив = null, получаем NullPointerException
        System.out.println(sum2d(null));
        
    }

    // нам представлен метод, который принимает в себя двумерный массив строк, преобразует значения в целое число и возвращает сумму первых 5 столбцов 
    public static int sum2d (String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
