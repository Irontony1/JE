import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        //Задание 1
        //System.out.println(ArithmeticException(10,0));
        //System.out.println(Arrays.toSting(new int[]{ArrayIndexOut(10)}));
        //System.out.println(noFile("file.txt"));

        // Задание 2
        //int[] arr1 = new int[]{5,6,73,1,9};
        //int[] arr2 = new int[]{1,2,3,2,1};
        //System.out.println(Arrays.toString(diffArrays(arr1,arr2)));

        // Задание 3*
        int[] arr1 = new int[]{4, 6, 7, 8, 9};
        int[] arr2 = new int[]{4, 23, 7, 2, 3};
        System.out.println(Arrays.toString(divisionArrays(arr1, arr2)));
    }

    public static int ArithmeticException(int a, int b) {
        return a / b;
    }

    public static int ArrayIndexOut(int size) {
        int[] array = IntStream.generate(() -> new Random().nextInt(10)).limit(size).toArray();

        return array[size + 10];
    }

    public static String noFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        return br.readLine();
    }

    public static int[] diffArrays(int[] array1, int[] array2) {
        if (array1.length == 0) {
            throw new RuntimeException("the size of the array cannot be 0");
        }
        if (array1.length != array2.length) {
            throw new RuntimeException("arrays must be equal");
        }

        int[] ans = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            ans[i] = array1[i] - array2[i];

        }
        return ans;
    }

    public static int[] divisionArrays(int[] array1, int[] array2) {
        if (array1.length == 0) {
            throw new RuntimeException("the size of the array cannot be 0");
        }
        if (array1.length != array2.length) {
            throw new RuntimeException("arrays must be equal");
        }

        int[] ans = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            try {
                ans[i] = array1[i] / array2[i];
            } catch (Exception e) {
                throw new RuntimeException("/ by 0");
            }

        }
        return ans;
    }

}