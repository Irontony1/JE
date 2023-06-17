import java.io.FileWriter;
import java.io.IOException;

public class UserDataFileWriter implements I_UserDataFileWriter {

    @Override
    public void writeUserData(UserData userData) throws IOException {
        String fileName = userData.getLastName();
        try (FileWriter writer = new FileWriter(fileName, true)){
            String userDataString = String.join(" ",
                    userData.getLastName(),
                    userData.getFirstName(),
                    userData.getMiddleName(),
                    String.valueOf(userData.getPhoneNumber()));
            writer.write(userDataString + "\n");
        }
        System.out.println("Данные успешно записаны в файл: " +
                fileName +".txt");
    }
}
