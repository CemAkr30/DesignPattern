package structural.adapterDP;

public interface IError {
    String getErrorCode();
    String getErrorMessage();
    void sendEmail();
}
