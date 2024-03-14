package creational.abstractFactoryDP.factory;

import creational.abstractFactoryDP.model.IPhone;
import creational.abstractFactoryDP.model.S8;

public class S8Factory
 implements IPhoneFactory {
    @Override
    public IPhone getIPhone(String model, String battery, int width, int height) {
        return new S8(model, battery, width, height);
    }
}
