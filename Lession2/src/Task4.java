import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task4 {
    /*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/

    public static void start() {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите ваше Имя: ");
            String name = scanner.nextLine();
            System.out.println("Введите вашу Фамилию: ");
            String lastName = scanner.nextLine();
            if (name.equals("") || lastName.equals("")) throw new MyException("Эти поля не может быть пустым") {
            };

            System.out.printf("Вас зовут - %s\n", name);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            ;
        }
    }

    static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }
}
