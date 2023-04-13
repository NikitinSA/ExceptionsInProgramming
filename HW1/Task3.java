package HW1;

public class Task3 {
    public static void main(String[] args) {
        //в первом случае получим просто вывод результирующего массива
        // int[] arr1 = {2, 3, 4, 5};
        // int[] arr2 = {1, 1, 1, 1};

        //во втором получим наше сообщение
        int[] arr1 = {2, 3, 4};
        int[] arr2 = {1, 1, 1, 1};

        print(arrayDifference(arr1, arr2));

    }

    public static int[] arrayDifference (int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) { //проверяем на равенство
            throw new RuntimeException("Аrray lengths are not equal");
        }
        int[] result = new int [arr1.length];//если прошли проверку, возвращаем массив
        for (int i = 0; i < result.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    //вспомогательный метод вывода массива на экран
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
}