public class UserDataException extends Exception {
    StringBuilder errCode = new StringBuilder("100");

    public UserDataException(String message, String errCode) {
        super(message);
        this.errCode.append(errCode);
    }

    public String getErrCode() {
        return errCode.toString();
    }
}
