package creational.abstractFactoryDP.factory;

import creational.abstractFactoryDP.model.IPhone;
import creational.abstractFactoryDP.model.Note8;

public class Note8Factory
        implements IPhoneFactory{
    @Override
    public IPhone getIPhone(String model, String battery, int width, int height) {
        return new Note8(model, battery, width, height);
    }
}
