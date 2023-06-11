import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    /*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

    public static void start() {
        while (true) {
            System.out.println("Введите число типа float: ");
            try {
                Scanner sc = new Scanner(System.in);
                float num = sc.nextFloat();
                System.out.printf("Принято %f\n",num);
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не корректные данные. Тип float не должен содержать символов, а в качестве разделителя используется ','");
            }
        }
    }
}
