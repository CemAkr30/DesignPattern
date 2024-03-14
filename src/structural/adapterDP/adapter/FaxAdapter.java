package structural.adapterDP.adapter;

import structural.adapterDP.FaxError;
import structural.adapterDP.IError;

public class FaxAdapter
    implements IError {

    private FaxError faxError;

    public FaxAdapter(FaxError faxError) {
        this.faxError = faxError;
    }

    @Override
    public String getErrorCode() {
        return faxError.getErrorCode();
    }

    @Override
    public String getErrorMessage() {
        return faxError.getErrorMessage();
    }

    @Override
    public void sendEmail() {
        System.out.println("FaxAdapter sendEmail");
    }
}
