import java.util.Random;

public class Task2 {
    /*try {
        int d = 0;
        double catchedRes1 = intArray[8] / d; // intArray не инициализирован, d всегда = 0
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {    // исключение указано верное, на 0 делить нельзя
        System.out.println("Catching exception: " + e);
        }*/
    public static void start(){
        int[] intArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(10);
        }
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }


}
