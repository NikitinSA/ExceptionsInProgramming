package HW2;

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;//мы обращаемся к индексу за пределами массива, так как он инициализирован размером 2
        // } catch (NullPointerException ex) {
            // System.out.println("Указатель не может указывать на null!");
        // Лишнее действие, код просто не компилируется при попытке присвоить значение null, так как тип массива int, а не Integer
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }  catch (Throwable ex) { //надо поменять блоки местами, иначе код просто не пойдет дальше, так как это базовый класс
            System.out.println("Что-то пошло не так...");
        }
     }
    public static void printSum(Integer a, Integer b) { //throws FileNotFoundException лишнее, мы не обращаемся ни к каким файлам
        System.out.println(a + b);
    }
     
}