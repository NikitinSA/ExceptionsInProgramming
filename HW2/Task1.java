package HW2;

import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
// приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Task1 {

    public static void main(String[] args) {
        float number = getFloat();
        System.out.println(number);
    }

    public static float getFloat(){
        Scanner iScanner = new Scanner(System.in);
        float result = -1;
        boolean isFloat = false;
        while(!isFloat) {
            System.out.println("Введите число типа float: ");
            String data = iScanner.nextLine();
            try {
                result = Float.parseFloat(data);
                isFloat = true;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Попробуйте снова.");
            }
        }
        return result;
    }
}