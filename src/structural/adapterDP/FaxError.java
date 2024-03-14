package structural.adapterDP;

public class FaxError {

    private String errorCode;
    private String errorMessage;

    public FaxError() {
    }

    public FaxError(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
