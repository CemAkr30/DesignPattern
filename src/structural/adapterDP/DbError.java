package structural.adapterDP;

public class DbError
    implements IError {
    private String errorCode;
    private String errorMessage;

    @Override
    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public void sendEmail() {
        System.out.println("DbError sendEmail");
    }
}
