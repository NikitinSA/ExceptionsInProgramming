package HW2;

public class Task2 {
    public static void main(String[] args) {
        // int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
        //если передать в код массив размером меньше 9, то будет вылетать ArrayIndexOutOfBoundsException
        // String[] intArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        //при попытке передать массив строк, код просто не компилируется
        //преобразование строк теряет смысл алгоритма, поскольку он логичен только в том случае
        //когда мы не знаем придет нам массив целых или дробных чисел
        //в первом случае получим арифметическую ошибку деления на ноль
        //во втором бесконечность
        float[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } 
    }
}
