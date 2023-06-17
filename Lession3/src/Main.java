import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        I_UserInputReader inputReader = new UserInputConsoleReader(scanner);
        I_UserDataFileWriter fileWriter = new UserDataFileWriter();

        try {
            UserData userData = inputReader.readUserData();
            fileWriter.writeUserData(userData);

        } catch (IOException e) {
            System.out.printf("Ошибка: %s ", e.getMessage());
        } catch (UserDataException e) {
            System.out.printf("Ошибка: %s - код ошибки (%s)", e.getMessage(), e.getErrCode());
        }
    }
}
