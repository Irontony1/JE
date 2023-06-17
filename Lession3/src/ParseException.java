public class ParseException extends Exception {
    StringBuilder errCode = new StringBuilder("200");

    public ParseException(String message, String errCode) {
        super(message);
        this.errCode.append(errCode);
    }

    public String getErrCode() {
        return errCode.toString();
    }

}
