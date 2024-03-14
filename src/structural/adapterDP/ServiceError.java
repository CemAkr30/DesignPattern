package structural.adapterDP;

public class ServiceError
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
        System.out.println("ServiceError sendEmail");
    }
}
