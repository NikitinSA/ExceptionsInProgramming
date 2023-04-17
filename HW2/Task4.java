package HW2;

import java.net.Socket;
import java.util.Scanner;

import javax.sound.midi.Soundbank;


public class Task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Ввод: ");
        String input = iScanner.nextLine();
        
        if (input.isEmpty()) {
            throw new RuntimeException("Нельзя вводить пустые строки");
        }

        //поскольку такое поведение не очень хорошо для работы программы, лучше воспользоваться циклом
        //и запрашивать строку пока она не будет не пустой

        // while(input.isEmpty()) {
        //     System.out.println("Вы ввели пустую строку. попробуйте еще раз");
        //     input = iScanner.nextLine();
        // }

        System.out.println(input);
    }
}